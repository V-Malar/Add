package newwork;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	Scanner sc = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<String>();

	public BankAccount(int accountNumber, double balance, String customerName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
	}

	public void setter() {
		String s;
		s = "Account Number: " + accountNumber + "\nBalance: " + balance + "\nCustomer Name: " + customerName + "\n\n";
		list.add(s);
	}

	static void getter() {
		list.forEach((action) -> System.out.println(action));
	}

	void modifier(String customername) {
		customerName=customername;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName;
		int accountNumber;
		double balance;
		int i = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Bank Users: ");
		n = sc.nextInt();
		while (i <= n) {
			System.out.println("Enter Account User's Number: ");
			accountNumber = sc.nextInt();
			System.out.println("Enter Account User's Balance: ");
			balance = sc.nextDouble();
			System.out.println("Enter Account User's Name: ");
			customerName = sc.next();
			BankAccount b = new BankAccount(accountNumber, balance, customerName);
			b.setter();
			i++;
		}
		getter();
	}

}
