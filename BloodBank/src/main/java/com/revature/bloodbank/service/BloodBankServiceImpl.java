package com.revature.bloodbank.service;

import org.apache.log4j.Logger;

import com.revature.bloodbank.dao.BloodBankDAO;
import com.revature.bloodbank.dao.BloodBankDAOImpl;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodBankServiceImpl implements BloodBankService{
	BloodBankDAO bloodBankDaoImpl=new BloodBankDAOImpl();
	static Logger logger = Logger.getLogger("BloodBankServiceImpl.class");
	public void addBloodBankCenter(BloodBankCenter bloodBankCenter) {
		logger.info("in service add method");
		try {
			
			bloodBankDaoImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delBloodBankCenter(BloodBankCenter bloodBankCenter) {
		logger.info("in service delete method");
		try {
			
			bloodBankDaoImpl.delBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updBloodBankCenter(BloodBankCenter bloodBankCenter) {
		logger.info("in service update method");
		try {
			
			bloodBankDaoImpl.updBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dispBloodBankCenter(BloodBankCenter bloodBankCenter) {
		//logger.info("in service delete method");
		try {
			
			bloodBankDaoImpl.dispBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
