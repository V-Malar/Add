package Practice;

import java.util.Scanner;

public class StudentMarks {
	static Scanner sc = new Scanner(System.in);
	static void calculate(int n)
	{
		for (int i = 0; i < n; i++)
		{
			int mark = 0;
			System.out.println("Student No. " + (i + 1));
			for (int j = 0; j < 3; j++)
			{
				System.out.println("Enter Mark " + (j + 1) + " ");
				mark += sc.nextInt();
			}
			System.out.println("Total Marks: " + mark);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter how many students: ");
		n = sc.nextInt();
		calculate(n);
	}

}
