package cs101;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program1 {

	public static void main(String[] args) {
		
		//Method when NOT using @Override => 795.00
		Account acc1 = new Account(1001, "Mary", 1000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		//Method when using @Override => 800.00
		Account acc2 = new SavingsAccount(1002, "Mike", 1000.00, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		//Method when using Super Class => 793.00
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());

	}

}
