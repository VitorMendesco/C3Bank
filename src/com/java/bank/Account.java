package com.java.bank;

public class Account {

	Client client = new Client();
	
	private int number, agency;
	private double balance;	

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

	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getAgency() {
		return this.agency;
	}
	public void setAgency(int agency) {
		this.agency = agency;
	}

	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}

	public double removeBalance(double balance) {
		this.balance -= balance;
		return this.balance;
	}
}
