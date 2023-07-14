package Practice;

import java.util.Scanner;

public class PrintNumber {
	static void print(int number)
	{
		System.out.println("Your number is: " + number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		print(number);
	}

}
