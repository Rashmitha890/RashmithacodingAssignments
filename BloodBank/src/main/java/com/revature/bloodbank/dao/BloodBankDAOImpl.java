package com.revature.bloodbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.util.DBUtil;


public class BloodBankDAOImpl  implements BloodBankDAO{
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		//jdbc adding bloodbank details
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into BloodBankCenter values(?,?,?,?,?,?)");
			pst.setInt(1, bloodBankCenter.getCenterId());
			pst.setString(2, bloodBankCenter.getCenterName());
			pst.setString(3, bloodBankCenter.getStreet());
			pst.setString(4, bloodBankCenter.getCity());
			pst.setString(5, bloodBankCenter.getState());
			pst.setString(6, bloodBankCenter.getPincode());
			pst.execute();
			System.out.println("data inserted..");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("Data not inserted Add another id");
		}
	
		
		}
	

	public void delBloodBankCenter(BloodBankCenter bloodBankCenter) {
		// jdbc  Removing data statement
	try {
			
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from BloodBankCenter where centerId=?");
			pst.setInt(1, bloodBankCenter.getCenterId());
			int x=pst.executeUpdate();
			pst.close();
			con.close();
			if(x==1) {
				System.out.println("Record deleted..");
			}
			else
			{
				System.out.println("No Record found.");
			}
			
			
		}
		catch(Exception e) {
			
		}
	}
	
	public void updBloodBankCenter(BloodBankCenter bloodBankCenter) {
		// jdbc update
	try {
			
			Connection con=DBUtil.getConnection();
			String str="update BloodBankCenter set centerName=?,street=?,city=?,state=?,pincode=? where centerId=?";
			PreparedStatement pst=con.prepareStatement(str);
			
			pst.setString(1, bloodBankCenter.getCenterName());
			pst.setString(2, bloodBankCenter.getStreet());
			pst.setString(3, bloodBankCenter.getCity());
			pst.setString(4, bloodBankCenter.getState());
			pst.setString(5, bloodBankCenter.getPincode());
			pst.setInt(6, bloodBankCenter.getCenterId());
			int x=pst.executeUpdate();
			pst.close();
			con.close();
			if(x==1) {
				System.out.println("Record updated..");
			}
			else
			{
				System.out.println("No Record found.");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dispBloodBankCenter(BloodBankCenter bloodBankCenter) {
		// jdbc display statement
	try {
			
			Connection con=DBUtil.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from BloodBankCenter");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println(" CenterID: "+rs.getInt(1)+" |CenterName: "+rs.getString(2)+" |Street: "+rs.getString(3)+" |City: "+rs.getString(4)+" |State: "+rs.getString(5)+" |Pincode: "+rs.getString(6));
			}
			rs.close();
			pst.close();
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
