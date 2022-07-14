package com.csi.customercontroller;

import java.util.Scanner;

import com.csi.customerservices.CustomerService;
import com.csi.model.Customer;

public class Customer_Controller {
	public static void main(String[] args) {

		Customer customer = new Customer("12345", "abc");
		Scanner scanner = new Scanner(System.in);
		CustomerService customerservice = new CustomerService();
		
		boolean status;
		do {
			System.out.println("\n Please Enter Customer Account Number And Password ");

			String custAccNo = scanner.nextLine();
			String custPWD = scanner.nextLine();

			if (customer.getCustomerAccountNumber().equals(custAccNo)
					&& customer.getCustomerPassword().equals(custPWD)) {
				System.out.println("\n Welcome To INDIAN BANK");
				status = false;
			} else {
				System.out.println("\n Invalid Credential Please Try Again!!!");
				status = true;
			}
		} while (status);
		status=true;
		do {

		System.out.println("\n Please Enter Your Choice-:");
		System.out.println(
				"\n 1. Deposit \n 2. Withdraw \n 3. Transfer \n 4. Change Contact Number \n 5.Change Address \n 6. Check Balance \n 7. Logout");

		int choice = scanner.nextInt();
		

		switch (choice) {
		case 1: //1. Deposit
			customerservice.deposit();

			break;
		case 2: //2. Withdraw
			customerservice.withdraw();

			break;
		case 3: //3. Transfer
			customerservice.transfer();

			break;
		case 4: //4. Change Contact Number
			customerservice.changeContactNumber();

			break;
		case 5: //5.Change Address
			customerservice.changeAddress();

			break;
		case 6: //6. Check Balance
			customerservice.checkBalance();

			break;
		case 7: //7. Logout
			customerservice.logout();

			break;

		default:System.out.println("\n Invalid Choice");
			break;
		}
		}while(status);

	}

}
