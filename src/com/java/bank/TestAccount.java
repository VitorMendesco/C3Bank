package com.java.bank;

public class TestAccount {
	
	public static void main(String[] args) {
		Account checkingAccount = new Account();
		Account savingsAccount = new Account(202, 2, 500);
		Account investAccount = new Account(404, 4, 870.0, (byte) 20, "Gabriel");
		
		checkingAccount.setNumber(101);
		checkingAccount.setAgency(1);
		checkingAccount.setBalance(1000.00);		
		checkingAccount.client.setAge((byte) 18);
		checkingAccount.client.setName("Vitor");
		
		/*savingsAccount.setNumber(202);
		savingsAccount.setAgency(2);
		savingsAccount.setBalance(500);*/
		savingsAccount.client.setAge((byte) 19);
		savingsAccount.client.setName("Eduarda");
		
		/*investAccount.setNumber(404);
		investAccount.setAgency(4);
		investAccount.setBalance(870.0);
		investAccount.client.setAge((byte) 20);
		investAccount.client.setName("Gabriel");*/
		
		
		Account[] arr = new Account[3];
		arr[0] = checkingAccount;
		arr[1] = savingsAccount;
		arr[2] = investAccount;
		
		for (byte i = 0; i < arr.length; i++) {
			String name = arr[i].client.getName();
			byte age = arr[i].client.getAge();
			int agency = arr[i].getAgency(), number = arr[i].getNumber();
			double balance = arr[i].getBalance();
			
			System.out.println(
					"\nName: " + name + 
					"\nAge: " + age + 
					"\nAgency: " + agency + 
					"\nNumber: " + number + 
					"\nBalance: " + balance
					);
		}
		
	}
	
}
