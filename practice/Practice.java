package Practice;
import java.util.Scanner;

public class Practice {
	static int pass = 23;
	static void hello()
	{
		System.out.println("Hello World");
	}
	
	static void defaulltValues()
	{
		byte b = 0;
		short s = 0;
		int n = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		char c = '\0';
		String str = "";
		boolean bool = false;
		System.out.println(b);
		System.out.println(s);
		System.out.println(n);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c+"a");
		System.out.println(str);
		System.out.println(bool);
	}
	
	static String prime(int number)
	{
		for (int i = 0; i < number; i++)
		{
		return number == 2 || number %2 == 1 ? "Prime" : "Not Prime";
		}
		return null;
	}
	
	static void average(int[] number)
	{
		int result = 0;
		for (int n: number)
		{
			result+=n;
		}
		System.out.println(result / number.length);
	}
	
	static int[] sort(int[] numbers)
	{
		int max =numbers[0];
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = i+1; j < numbers.length; j++)
			{
				if (numbers[i] > numbers[j])
				{
					max = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = max;
				}
			}
		}
		return numbers;
	}
	static void ascendingOrder(int[] output)
	{
		for (int i : output)
		{
			System.out.println(i);
		}
	}
	static void descendingOrder(int[] output)
	{
		for (int i = output.length - 1; i >=0  ; i--)
		{
			System.out.println(output[i]);
		}
	}
	static void locate(int[] output, int number)
	{
		for (int i = 0; i < output.length  ; i++)
		{
			if (number == output[i])
			{
				System.out.println(i);
			}
		}
	}
	static void rectangle()
	{
		int k = 1;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				System.out.print(k + "\t");
				k++;
			}
			System.out.println();
		}
	}
	static void rightAngledTriangle()
	{
		int k = 1;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(k + "\t");
				k++;
			}
			System.out.println();
		}
	}
	static void stu_mark()
	{
		int result = 1;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 4; j++)
			{
				result += j;
			}
			System.out.println("Student: " + i + " " + result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		hello(); // HELLO WORLD
		defaulltValues();
		int number = 3;
		System.out.println(number == 1 ? "Not Prime" : prime(number));
		int[] arr = {1,2,3,4,5};
		average(arr);
		int[] asc = {1,-300,700,4,5, 0};
		int[] output = sort(asc);
		System.out.println();
		ascendingOrder(output);
		descendingOrder(output);
		locate(output, -300);
		rectangle();
		rightAngledTriangle();
		System.out.print("Enter Square value: ");
		int a = sc.nextInt();
		final int pass_this = 24;
		DoWhileLoop.display(pass_this);
		System.out.println("Area of Square: " + a * a);
		stu_mark();
	}

}
