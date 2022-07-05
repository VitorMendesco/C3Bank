package com.c3.bank;

import java.io.Serializable;

/**
 * <pre>
 * CheckingAccount is a subclass from Account that is segmented in types and has an overdraft.
 * 
 * - checking accounts have an extended balance limit (overdraft)
 * - checking accounts have an additional percentage tax at withdraw
 * </pre>
 * @author Vitor
 * @version 1.1
 */
public class CheckingAccount extends Account implements Serializable {

	/** serializable id */
	private static final long serialVersionUID = 1L;
	/** type of checking account: real, personal or nominal */
	private String type;
	/** overdraft for the checking account */
	private double overdraft;

	/** all constructors */
	public CheckingAccount() {

	}
	public CheckingAccount(String type) {
		this.type = type;
	}
	public CheckingAccount(String type, double overdraft) {
		this(type);
		this.overdraft = overdraft;
	}
	public CheckingAccount(int number, int agency, double balance, byte age, String name, String type, double overdraft) {
		super(number, agency, balance, age, name);
		this.type = type;
		this.overdraft = overdraft;
	}

	/** get the account type from subclass CheckingAccount
	 * @return the type of checking account */
	public String getType() {
		return type;
	}

	/** set the type value of the checking account from subclass CheckingAccount
	 * @param type - String to replace the actual checking account type value */
	public void setType(String type) {
		this.type = type;
	}

	/** get the overdraft from the checking account from subclass CheckingAccount
	 * @return the checking account overdraft */
	public double getOverdraft() {
		return overdraft;
	}

	/** set the overdraft of the checking account from subclass CheckingAccount
	 * @param overdraft - double to replace the actual checking account overdraft value */
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	/** get the total account balance from subclass CheckingAccount, adding the overdraf limit
	 * @return the sum of the balance with the overdraft */
	public double getAvailableBalance() {
		return super.getBalance() + this.getOverdraft();
	}
	
	/** add a value to the balance from subclass CheckingAccount, and returns the total balance (+overdraft)
	 * @param balance - value to add to the total account balance
	 * @return the sum of the balance with the overdraft */
	@Override
	public double addBalance(double balance) {
		super.addBalance(balance);
		return this.getAvailableBalance();
	}
	
	/** remove from balance from subclass CheckingAccount, with an additional tax of 10%
	 * @param balance - value to remove from the total account balance
	 * @return the sum of the balance with the overdraft */
	@Override
	public double removeBalance(double balance) {
		balance *= 1.1;
		super.removeBalance(balance);
		return this.getAvailableBalance();
	}

}
