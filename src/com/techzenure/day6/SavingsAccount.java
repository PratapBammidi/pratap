/**
 * program on Savings Account Method Of Banking Application
 * @author Pratap
 * @since 2nd Aug 2023
 */
package com.techzenure.day6;

public class SavingsAccount extends Account {
	float roi;
	public SavingsAccount(long acon, String name, float bal ,float roi) {
		super(acon, name, bal);
		this.roi = roi;
		
	}

	 public void calculateInterest() {
		 float intrst = roi * this.getBal()/100;
		 super.deposit(intrst);
	 }
}
