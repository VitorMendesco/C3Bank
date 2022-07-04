package com.c3.bank;

import java.io.Serializable;

/**
 * CheckingAccount is a subclass from Account that is segmented in types and has an overdraft
 * @author Vitor
 * @version 1.0
 */
public class CheckingAccount extends Account implements Serializable {
	
	/** serializable id */
	private static final long serialVersionUID = 1L;
	/** type of checking account: real, personal or nominal */
	private String type;
	/** overdraft for the checking account */
	private double overdraft;
	
	/** get the account type from subclass CheckingAccount
	 * @return the type of checking account */
	public String getType() {
		return type;
	}
	
	/** set the type value of the checking account
	 * @param type - String to replace the actual checking account type value */
	public void setType(String type) {
		this.type = type;
	}
	
	/** get the overdraft from the checking account
	 * @return the checking account overdraft */
	public double getOverdraft() {
		return overdraft;
	}
	
	/** set the overdraft of the checking account
	 * @param overdraft - double to replace the actual checking account overdraft value */
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public double getAvailableBalance() {
		return super.getBalance() + this.getOverdraft();
	}
	
}
