package com.c3.bank;

/**
 * TestInheritance is unit test class to inheritance accounts
 * @author Vitor
 * @version 1.0
 */
public class TestInheritance {

	public static void main(String[] args) {
		
		CheckingAccount emptyAccount = new CheckingAccount();
		CheckingAccount halfAccount = new CheckingAccount("Real", 200);
		CheckingAccount fullAccount = new CheckingAccount(101, 1, 1000.0, (byte) 18, "Vitor", "Personal", 150.0);
		
		System.out.println("\n--- Inheritance Unit Test ---\n");

		// TYPE AT OBJECT DECLARATION
		System.out.println("- Type at Object Declaration:");
		System.out.println(emptyAccount.getType());
		System.out.println(halfAccount.getType());
		System.out.println(fullAccount.getType());
		
		// USING METHODS
		System.out.println("\n- Using Methods:");
		System.out.println("Balance: U$" + fullAccount.getBalance());
		System.out.println("Overdraft: " + fullAccount.getOverdraft());
		System.out.println("Balance + Overdraft: U$" + fullAccount.getAvailableBalance());
		System.out.println("Account Type: " + fullAccount.getType());
		
		// CHANGING VALUES
		System.out.println("\n- Changing Values:");
		double bonusBalance = 340;
		System.out.println("-- Adding U$" + bonusBalance + "...");
		System.out.println("Actual balance: U$" + fullAccount.addBalance(bonusBalance));
		double removeBalance = 180;
		System.out.println("\n-- Removing U$" + removeBalance + "...");
		System.out.print("--- 10% Tax applied: U$");
		System.out.printf("%.2f", (removeBalance * 1.1));
		System.out.println("\nActual total balance: U$" + fullAccount.removeBalance(removeBalance));		
		
	}
	
}
