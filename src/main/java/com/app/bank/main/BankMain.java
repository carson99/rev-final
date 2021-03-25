package com.app.bank.main;

import java.util.Random;
import java.util.Scanner;
import java.sql.Date;
import java.lang.NumberFormatException;

import org.apache.log4j.Logger;

import com.app.model.Customer;
import com.app.model.Address;
import com.app.service.LogService;

public class BankMain {
	
	private static Logger log=Logger.getLogger(BankMain.class);
	public static void main(String[] args) {	

	int ch=0;
	int ch1=0;
	int j=0;
	String pw;
	Scanner sc=new Scanner(System.in);
	
		log.info("Welcome to the Priamhark Bank Application, Version 1.0.");
		log.info("==========================================");
		do {
		log.info("Do you have an account with us? Please type one selection's number.");
		log.info("1) Yes");
		log.info("2) No");
		log.info("3) Exit");
		try {
			ch=Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			
		}
		switch (ch) {
		
		int c;
		String p;
		case 1: log.info("Log in as a customer or an employee");
				log.info("1) Customer");
				log.info("2) Employee");
				
				switch (ch1) {
				case 1: log.info("Please enter your customer ID");
						c=sc.nextLine();
						log.info("Please enter your password");
						p=sc.nextLine();
						if(c==839063 && p=="bicfhy") {
							log.info("Hello, Harrowhwark Nonagesimus.");
						} else if(c==647255 && p=="whosasking") {
							log.info("Hello, Sasha Racket.");
						} else if(c==273185 && p=="supervigilio") {
							log.info("Hello, Sasha James.");
						} else {
							log.info("You are not registered as an employee.");
						}
					break;
				case 2: log.info("Please enter your employee ID");
					break;
				default: log.warn("This does not correspond to an existing ID.");
					break;
				}
			try {
				
				j=Integer.parseInt(sc.nextLine());
				log.info("Please enter your password");
				pw=sc.nextLine();
				
			} catch(NumberFormatException e) {
				log.warn("That does not correspond to an existing account number.");
			}
			break;
		case 2: log.info("To open an account, we'll need some information from you.");				
				Customer customer=new Customer();
				Address address=new Address();
				Random r=new Random();
				int i=r.nextInt(90000)+10000;
				
				log.info("Please enter your first name");				
				customer.setFirstName(sc.nextLine());
				log.info("Please enter your last name");
				customer.setLastName(sc.nextLine());
				log.info("Please enter your phone number with no special characters or spaces (1234567890)");
				customer.setPhone(Integer.parseInt(sc.nextLine()));
				log.info("Please enter your email address");
				customer.setEmail(sc.nextLine());
				
				log.info("Thank you. Now we'll take down your address details.");
				log.info("Please enter your zip code");
				customer.setZip(Integer.parseInt(sc.nextLine()));
				log.info("Please enter your house number");
				address.setHouseNo(Integer.parseInt(sc.nextLine()));
				log.info("Please enter your apartment number, if applicable (enter '0' if not)");
				address.setAptNo(Integer.parseInt(sc.nextLine()));
				log.info("Please enter the name of your street");
				address.setStreet(sc.nextLine());
				log.info("Please enter your state");
				address.setState(sc.nextLine());
				
				log.info("Thank you for applying for an account with us.");
				log.info("Your customer ID is "+i);
				customer.setCustomerid(i);
				log.info("Please set a password.");
				customer.setPassword(sc.nextLine());
				log.info("You can use your ID and password to check the status of your account. Thank you!");
			break;
		case 3: log.info("Thank you for using the Priamhark Bank Application! Goodbye.");
			break;
		default:log.warn("Invalid choice. Please enter a number from 1 to 3 to proceed.");
			break;
		}
		} while(ch!=3);
		
	}

}
