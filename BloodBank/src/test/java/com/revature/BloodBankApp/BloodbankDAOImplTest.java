package com.revature.BloodBankApp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import com.revature.bloodbank.dao.BloodBankDAOImpl;
import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;

public class BloodbankDAOImplTest {

	@Test
	public void testgetAllcenters() {
		boolean flag=false;
		List<BloodBankCenter> list= new ArrayList<BloodBankCenter>();
		try{
			Connection con=DBUtil.getConnection();
			Statement ps=con.createStatement();
			ResultSet  rs=ps.executeQuery("select * from BloodBankCenter ");
			if(rs.next())
			{
				flag=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		assertTrue(flag);
	}
	
	@Test
	public void testdeleteBloodBankCenter(){
		int count=0,count1=0;
		try{
			Connection con=DBUtil.getConnection();
			Statement ps=con.createStatement();
			ResultSet  rs=ps.executeQuery("select * from BloodBankCenter");
			while(rs.next()){
				count++;
			}
			BloodBankDAOImpl daodel=new BloodBankDAOImpl();
			BloodBankCenter bloodBankCenter=new BloodBankCenter();
			daodel.delBloodBankCenter(bloodBankCenter);
			ResultSet rs1=ps.executeQuery("select * from BloodBankCenter");
			
			while(rs1.next()){
				count1++;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(count);
		System.out.println(count1);
		assertNotEquals(count, count1);
	}
	@Test
	public void testaddBloodBankCenter(){
		int id=0;
		boolean flag1=false;
		try{
			Connection con=DBUtil.getConnection();
			Statement ps=con.createStatement();
			int  rs=ps.executeUpdate("insert into bloodbankcenter values(10,'dsvf','dsvs','vsffvs','dvsfs',32443)");
			BloodBankDAOImpl daoadd=new BloodBankDAOImpl();
			BloodBankCenter bloodBankCenter=new BloodBankCenter();
			daoadd.addBloodBankCenter(bloodBankCenter);
			PreparedStatement pst=con.prepareStatement("select * from BloodBankCenter where id=10");
			ResultSet rs1=pst.executeQuery();
			if(rs1.next())
			{
				flag1=true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		assertTrue(flag1);
	}
	
	@Test
	public void testupdateBloodBankCenter(){
		boolean flag=false;
		try{
			Connection con=DBUtil.getConnection();
			Statement ps=con.createStatement();
			int rs=ps.executeUpdate("update bloodbankcenter set name='abc' where id=7");
			BloodBankDAOImpl daoadd=new BloodBankDAOImpl();
			BloodBankCenter bloodBankCenter=new BloodBankCenter();
			daoadd.updBloodBankCenter(bloodBankCenter);
			ResultSet rs1=ps.executeQuery("select * from bloodbankcenter where name='def'");
			if(rs1.next())
			{
				flag=true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		assertTrue(flag);
	}

}