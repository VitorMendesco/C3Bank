package com.c3.bank;

import java.io.Serializable;

/** 
 * Account is a class that abstracts simple functions of bank account
 * @author Vitor
 * @version 1.1
 */
public class Account implements Serializable {

	Client client = new Client();

	/** serializable id */
	private static final long serialVersionUID = 1L;
	/** account number and agency */
	private int number, agency;
	/** account balance */
	private double balance;	

	/** all constructors */
	public Account() {
	}	
	public Account(int number) {
		this.number = number;
	}
	public Account(int number, int agency) {
		this(number);
		this.agency = agency;
	}
	public Account(int number, int agency, double balance) {
		this(number, agency);
		this.balance = balance;
	}
	public Account(int number, int agency, double balance, byte age) {
		this(number, agency, balance);
		client.setAge(age);
	}
	public Account(int number, int agency, double balance, byte age, String name) {
		this(number, agency, balance, age);
		client.setName(name);
	}

	/** get the account number from class Account
	 * @return the number of the account */
	public int getNumber() {
		return this.number;
	}
	/** set the account number from class Account
	 * @param number - int to replace the actual account number value */
	public void setNumber(int number) {
		this.number = number;
	}

	/** get agency number from class Account
	 * @return the agency of the account*/
	public int getAgency() {
		return this.agency;
	}
	/** set agency number from class Account
	 * @param agency - int to replace the actual account agency value */
	public void setAgency(int agency) {
		this.agency = agency;
	}

	/** get the balance from class Account
	 * @return the balance of the account */
	public double getBalance() {
		return this.balance;
	}
	/** set the balance from class Account
	 * @param balance - double to replace the actual account balance value */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** add to balance from class Account
	 * @param balance - value to add to the total account balance */
	public void addBalance(double balance) {
		this.balance += balance;
	}

	/** remove from balance from class Account
	 * @param balance - value to remove from the total account balance
	 * @return the new account balance */
	public double removeBalance(double balance) {
		this.balance -= balance;
		return this.balance;
	}
}
