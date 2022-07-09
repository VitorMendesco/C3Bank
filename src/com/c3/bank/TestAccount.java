package com.c3.bank;

/** 
 * TestAccount is a unit test class to Account class
 * @author Vitor
 * @version 1.4
 */
public class TestAccount {

	public static void main(String[] args) {
		// Cannot execute anymore because Accoutn is an abstract class (can't be instantiated)
		/* 
		Account checkingAccount = new Account();
		Account savingsAccount = new Account(202, 2, 500);
		Account investAccount = new Account(404, 4, 870.0, (byte) 20, "Gabriel");
		*/
		Account checkingAccount = new CheckingAccount();
		Account savingsAccount = new CheckingAccount();
		Account investAccount = new CheckingAccount();
		Account errorAccount = null;

		if (checkingAccount != null) {			
			checkingAccount.setNumber(101);
			checkingAccount.setAgency(1);
			checkingAccount.setBalance(1000.00);		
			checkingAccount.client.setAge((byte) 18);
			checkingAccount.client.setName("Vitor");
		}

		if (savingsAccount != null) {
			/*savingsAccount.setNumber(202);
		savingsAccount.setAgency(2);
		savingsAccount.setBalance(500);*/
			savingsAccount.client.setAge((byte) 19);
			savingsAccount.client.setName("Eduarda");
		}

		if (investAccount != null) {			
			/*investAccount.setNumber(404);
		investAccount.setAgency(4);
		investAccount.setBalance(870.0);
		investAccount.client.setAge((byte) 20);
		investAccount.client.setName("Gabriel");*/
		}


		Account[] arr = new Account[4];
		arr[0] = checkingAccount;
		arr[1] = savingsAccount;
		arr[2] = investAccount;
		arr[3] = errorAccount;

		System.out.println("\n--- Account Unit Test ---\n");
		
		for (byte i = 0; i < arr.length; i++) {
			String message = "";
			if (arr[i] != null) {
				String name = arr[i].client.getName();
				byte age = arr[i].client.getAge();
				int agency = arr[i].getAgency(), number = arr[i].getNumber();
				double balance = arr[i].getBalance();

				message = 
						"\nAccount: " + arr[i] + 
						"\nName: " + name + 
						"\nAge: " + age + 
						"\nAgency: " + agency + 
						"\nNumber: " + number + 
						"\nBalance: " + balance
						;
			} else {
				message = "\n***Object at position [" + i + "] do not exist\n";
			}

			System.out.println(message);

		}

	}

}
