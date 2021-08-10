package com.revature.bloodbank.client;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.bloodbank.Controller.BloodBankController;
import com.revature.bloodbank.model.BloodBankCenter;

public class BloodbankApplication {
	static Logger logger = Logger.getLogger("BloodbankApplication.class");//Apply Logger 

	public static void main(String[] args) {
		BloodbankApplication ba=new BloodbankApplication();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			 								//Switch Cases
			System.out.println("\n1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Update");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("\n******Enter your choice*******");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				
				ba.addBloodBankCenter();
				break;
			case 2:
				ba.delBloodBankCenter();
				break;
			case 3:
				ba.updBloodBankCenter();
				break;
			case 4:
				ba.dispBloodBankCenter();
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				break;
			}
		}
		while(ch!=5);
		
	}


	public  void addBloodBankCenter() {										//Adding data
		// Insertion of Blood Bank Details
		System.out.println("==========BloodBank Application===========");
		
		BloodBankController bcontroller=new BloodBankController();
		
		System.out.println("enter boold bank details");
		Scanner sc=new Scanner(System.in);
		
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		logger.info("Entered in client");							//logger Entered in insert
		
		System.out.println("Enter the Center Id:");
		int centerId=sc.nextInt();
		sc.nextLine();
		
		 System.out.println("Enter the Center Name:");
		 String centerName=sc.nextLine();;
		
		 System.out.println("Enter the Street:");
		 String street=sc.nextLine();
		 
		 System.out.println("Enter the City:");
		 String city=sc.nextLine();;
		 
		 System.out.println("Enter the State:");
		 String state=sc.nextLine();;
		 
		 System.out.println("Enter the Pincode:");
		 String pincode=sc.nextLine();
		 
		 bloodBankCenter.setCenterId(centerId);
		 bloodBankCenter.setCenterName(centerName);
		 bloodBankCenter.setStreet(street);
		 bloodBankCenter.setCity(city);
		 bloodBankCenter.setState(state);
		 bloodBankCenter.setPincode(pincode);
		 
		 bcontroller.addBloodBankCenter(bloodBankCenter);
		 
		 
		
	}
	public void delBloodBankCenter() {								//deletion data
		// Deletion of Blood Bank Details
		logger.info("Entered in client");							//logger in deletion
		
		System.out.println("Enter the record number to delete:");
		
		BloodBankController bcontroller=new BloodBankController();
		
		Scanner sc=new Scanner(System.in);
		
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		
		int centerId=sc.nextInt();
		
		bloodBankCenter.setCenterId(centerId);
		
		bcontroller.delBloodBankCenter(bloodBankCenter);
		
	}
	public void updBloodBankCenter() {								//display data
		//Update of Blood Bank Details
		 BloodBankController bcontroller=new BloodBankController();
		 logger.info("Entered in client");	                        //logger in update
		System.out.println("enter boold bank details");
		Scanner sc=new Scanner(System.in);
		
		BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		
		
		System.out.println("Enter the Center Id:");
		int centerId=sc.nextInt();
		 bloodBankCenter.setCenterId(centerId);
		
		
		 System.out.println("Enter the Center Name:");
		 String centerName=sc.next();;
		 bloodBankCenter.setCenterName(centerName);
		
		 System.out.println("Enter the Street:");
		 String street=sc.next();
		 bloodBankCenter.setStreet(street);
		 
		 System.out.println("Enter the City:");
		 String city=sc.next();;
		 bloodBankCenter.setCity(city);
		 
		 System.out.println("Enter the State:");
		 String state=sc.next();;
		 bloodBankCenter.setState(state);
		 
		 System.out.println("Enter the Pincode:");
		 String pincode=sc.next();
		 bloodBankCenter.setPincode(pincode);
	
		 
		 bcontroller.updBloodBankCenter(bloodBankCenter);
	} 
	public void dispBloodBankCenter() {									//display data
		// Display details
		 BloodBankController bcontroller=new BloodBankController();
	
		 BloodBankCenter bloodBankCenter=new  BloodBankCenter();
		System.out.println("Center Details");
		 bcontroller.dispBloodBankCenter(bloodBankCenter);
	}

}
