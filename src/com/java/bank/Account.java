package com.java.bank;

/** 
 * Account is a class that abstracts simple functions of bank account
 * @author Vitor
 * @version 1.0
 */
public class Account {

	Client client = new Client();

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

	/** getNumber() from class Account
	 * @return the number of the account */
	public int getNumber() {
		return this.number;
	}
	/** setNumber() from class Account
	 * @param number - value to replace the actual account number */
	public void setNumber(int number) {
		this.number = number;
	}

	/** getAgency() from class Account
	 * @return the agency of the account*/
	public int getAgency() {
		return this.agency;
	}
	/** setAgency() from class Account
	 * @param agency - value to replace the actual account agency */
	public void setAgency(int agency) {
		this.agency = agency;
	}

	/** getBalance() from class Account
	 * @return the balance of the account */
	public double getBalance() {
		return this.balance;
	}
	/** setBalance() from class Account
	 * @param balance - value to replace the actual account balance */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** addBalance() from class Account
	 * @param balance - value to add to the total account balance */
	public void addBalance(double balance) {
		this.balance += balance;
	}

	/** removeBalance() from class Account
	 * @param balance - value to remove from the total account balance
	 * @return the new account balance */
	public double removeBalance(double balance) {
		this.balance -= balance;
		return this.balance;
	}
}
