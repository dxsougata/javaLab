// Create a class Account with accountNo, name, balance.
//Write functions to deposit, withdraw, and display balance

import java.util.Scanner;

class Account {
	private String accountNo;
	private String name;
	private double balance;

	Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount must be positive.");
			return;
		}
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive.");
			return;
		}
		if (amount > balance) {
			System.out.println("Insufficient balance.");
			return;
		}
		balance -= amount;
		System.out.println("Withdrawn: " + amount);
	}

	void display() {
		System.out.println("\nAccount Details:");
		System.out.println("Account No: " + accountNo);
		System.out.println("Name: " + name);
		System.out.printf("Balance: %.2f%n", balance);
	}
}

public class q23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String accNo = sc.nextLine();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter initial balance: ");
		double bal = sc.nextDouble();

		Account account = new Account(accNo, name, bal);

		System.out.print("Enter amount to deposit: ");
		double dep = sc.nextDouble();
		account.deposit(dep);

		System.out.print("Enter amount to withdraw: ");
		double wd = sc.nextDouble();
		account.withdraw(wd);

		account.display();

		sc.close();
	}
}
