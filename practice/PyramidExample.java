package Practice;

import java.util.Scanner;

public class PyramidExample {
	static void pyramid(int n)
	{
		System.out.println();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ^ ");
			}
			System.out.println("\n");
		}
	}
	static void reverse_pyramid(int n)
	{
		System.out.println();
		for (int i = 1; i <= n; i++)
		{
			for (int j = n; j >= i; j--)
			{
				System.out.print(" ^ ");
			}
			System.out.println("\n");
		}
	}
	static void floyd(int n)
	{
		System.out.println();
		int value = 1;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" " + value + " ");
				value++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(5);
		reverse_pyramid(5);
		floyd(4);
	}

}
