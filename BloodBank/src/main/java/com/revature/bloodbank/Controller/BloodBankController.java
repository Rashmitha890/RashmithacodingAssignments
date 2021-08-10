package com.revature.bloodbank.Controller;

import com.revature.bloodbank.model.BloodBankCenter;
import com.revature.bloodbank.service.BloodBankService;
import com.revature.bloodbank.service.BloodBankServiceImpl;

public class BloodBankController {
	
	BloodBankService bloodBankServiceImpl=new BloodBankServiceImpl();
	 public  void addBloodBankCenter(BloodBankCenter bloodBankCenter ) {
		   
		  try {
			bloodBankServiceImpl.addBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	 public  void delBloodBankCenter(BloodBankCenter bloodBankCenter ) {
		   
		  try {
			bloodBankServiceImpl.delBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	 public  void updBloodBankCenter(BloodBankCenter bloodBankCenter ) {
		   
		  try {
			bloodBankServiceImpl.updBloodBankCenter(bloodBankCenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	public void dispBloodBankCenter(BloodBankCenter bloodBankCenter) {
		// TODO Auto-generated method stub
		  try {
				bloodBankServiceImpl.dispBloodBankCenter(bloodBankCenter);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
