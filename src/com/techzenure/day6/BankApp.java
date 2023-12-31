/**
 * program on Bank App Method Of Banking Application
 * @author Pratap
 * @since 2nd Aug 2023
 */
package com.techzenure.day6;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Intrest Calculation");
			System.out.println("6. Service Charge");
			System.out.println("7. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				 if(acc == null) {
					 System.out.println("enter type of a/c [1.Savings | 2.Current] ");
					 int accType = sc.nextInt();
					 
					 System.out.print("enter a/c no: ");
					 long acno = sc.nextLong();
					 sc.nextLine();
					 
					 System.out.print("enter name: ");
					 String name = sc.nextLine();
					 
					 System.out.print("enter initial deposit Rs: ");
					 float amt = sc.nextFloat();
					 if(accType == 1) {
						 System.out.print("enter rate of interest: ");
						 float roi = sc.nextFloat();
						 acc = new SavingsAccount(acno,name , amt, roi);
					 }else {
						 acc = new CurrentAccount(acno, name, amt);
					 }
					 
					 //-- create an instance of Account type
					 
					 System.out.println("WELCOME TO STATE BANK OF INDIA--------");
				 }else
					 System.out.println("A/C IS ALREADY WITH US --- PLEASE DO ANY OTHER OPERATIONS");
				 break;
			 case 2:
				 if(acc != null) {
					 System.out.print("enter amount to deposit: ");
					 float amt = sc.nextFloat();
					 acc.deposit(amt);
				 }else {
					 System.err.println("PLEASE OPEN AN A/C WITH US");
				 }				 
				 break;
			 case 3:
				 if(acc != null) {
					 System.out.print("enter amount to withdraw: ");
					 float amt = sc.nextFloat();
					 acc.withdraw(amt);
				 }else {
					 System.err.println("PLEASE OPEN AN A/C WITH US");
				 }				 
				 break;
			 case 4:
				 if(acc != null) {
					acc.getBalance(); 
				 }else {
					 System.err.println("PLEASE OPEN AN A/C WITH US");
				 }
				 break;
			 case 5:
				 if(acc instanceof SavingsAccount) {
					 ((SavingsAccount)acc).calculateInterest();
				 }else {
					 System.err.println("THIS ACCOUNT WILL NOT BE HAVING THIS SERVICE");
				 }
				 break;
			 case 6:
				 if(acc instanceof CurrentAccount) {
					 ((CurrentAccount)acc).serviceCharge();
				 }else {
					 System.out.println("NO SERVICE CHARGES FOR THIS TYPE OF ACCOUNT");
				 }
				 break;
			 case 7:
				 System.out.println("application designed & developed by ");
				 System.out.println("\t team@techzenure");
				 sc.close();
				 System.exit(0); // to terminate the program execution
				 break;
			 default:
				 System.out.println("$$$--- INVALID SELECTION --- TRY AGAIN ---$$$");
			}//switch
			System.out.println("--------------------------------------------------------------------------\n");
		}//while
	}
}
