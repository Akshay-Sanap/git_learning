package com.csi.customerservices;

import java.util.Scanner;

public class CustomerService {
	double accountbalance = 50000, amount; 
	int accNo, otp,generatedOTP;
	long contactNumber = 9874563210l;
	String address = "Nashik";
	Scanner scanner = new Scanner(System.in);
	OTPGeneration otpGeneration=new OTPGeneration();
	

	public void deposit() {
		System.out.println("\n Please enter amount for deposit-: ");
		amount = scanner.nextDouble();
		accountbalance = accountbalance + amount;
		System.out.println("\n " + amount + " Deposited Successfully.");
		System.out.println("\n Your Available Balance Is-:" + accountbalance);
	}

	public void withdraw()
	{
		System.out.println("\n Please enter amount for withdraw-: ");
		amount=scanner.nextDouble();
		if (accountbalance>=amount)
		{
			accountbalance=accountbalance-amount;
			System.out.println("\n "+amount+" Withdraw Successfully.");
			System.out.println("\n Your Available Balance Is-:"+accountbalance);
		}
		else {
			System.out.println("\n Insufficient Fund..!!!!");
		}
	}

	public void transfer() {
		System.out.println("\n Please enter account number and amount for transfer-: ");
		accNo=scanner.nextInt();
		amount=scanner.nextDouble();
		if (accountbalance>=amount)
		{
			generatedOTP=otpGeneration.generatedOTP();
			System.out.println("\n Your One Time Password Is-: "+generatedOTP);
			System.out.println("\n Please Enter otp");
			otp=scanner.nextInt();
			if (otp==generatedOTP) {
			accountbalance=accountbalance-amount;
			System.out.println("\n "+amount+" Transfer Successfully.");
			System.out.println("\n Your Available Balance Is-:"+accountbalance);
			}
			else {
				System.out.println("\n Incorrect OTP!!!   Please Try Correct One ");
			}
		}
		else {
			System.out.println("\n Insufficient Fund..!!!!");
		}

	}

	public void changeContactNumber() {
		System.out.println("\n Please enter your existing contact number-: ");
		long existingcontno=scanner.nextLong();
		if(existingcontno==contactNumber)
		{
			System.out.println("\n Please enter new contact number for updation-:");
			long newcontactNo=scanner.nextLong();
			contactNumber=newcontactNo;
			System.out.println("\n Your contact number updated successfully.");
			System.out.println("\n Your New Contact Number Is-: "+contactNumber);
		}
		else {
			System.out.println("\n Sorry!!! \n You Have Entered Wrong Contact Number");
		}

	}

	public void changeAddress() {
		System.out.println("\n Please enter your existing address-: ");
		String existingadd=scanner.nextLine();
		if(existingadd.equals(address))
		{
			System.out.println("\n Please enter new address for updation-:");
			String newaddress=scanner.nextLine();
			address=newaddress;
			System.out.println("\n Your address updated successfully.");
			System.out.println("\n Your New address Is-: "+address);
		}
		else {
			System.out.println("\n Sorry!!! \n You Have Entered Wrong address");
		}

	}

	public void checkBalance() {
		generatedOTP=otpGeneration.generatedOTP();
		System.out.println("\n Your One Time Password Is-: "+generatedOTP);
		System.out.println("\n Please Enter otp");
		otp=scanner.nextInt();
		if (otp==generatedOTP) {
		System.out.println("\n Your Available Balance Is-:"+accountbalance);
		}
		else {
			System.out.println("\n Incorrect OTP!!!   Please Try Correct One ");
		}
		

	}

	public void logout() {
		System.out.println("\n Logout Successfully.. \n Thank You.....");
		System.exit(0);
	}

}
