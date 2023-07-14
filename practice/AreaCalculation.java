package Practice;

import java.util.Scanner;

public class AreaCalculation {
	static void area(int a)
	{
		System.out.println(a * a);
	}
	static void area(int a, int b)
	{
		System.out.println(a * b);
	}
	static void area(float f, int a, int b)
	{
		System.out.println(f * a * b);
	}
	static void area(double r)
	{
//		System.out.println(Math.PI);
		String num = String.format("%.2f", Math.PI);
		Double i = Double.valueOf(num);
//		System.out.println(i instanceof Double);
		Double circle = i * r * r;
		System.out.println(circle);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean set = true;
		while (true)
		{
	        	System.out.println("Square");
                System.out.println("Rectangle");
                System.out.println("Triangle");
                System.out.println("Circle");
                System.out.println("Exit");
                System.out.println("Enter Choice");
                String a = sc.nextLine();
		switch(a)
		{
		case "Square":
			System.out.println("Enter side value:");
			Integer square = sc.nextInt();
			area(square);
			break;
		case "Rectangle":
			System.out.println("Enter length value:");
			Integer length = sc.nextInt();
			System.out.println("Enter breadth value:");
			Integer breadth = sc.nextInt();
			area(length,breadth);
			break;
		case "Triangle":
			System.out.println("Enter base value:");
			Integer base = sc.nextInt();
			System.out.println("Enter height value:");
		    Integer height = sc.nextInt();
			area(0.5f, base, height);			
			break;
		case "Circle":
			System.out.println("Enter radius value:");
			Double radius = sc.nextDouble();
			area(radius);
			break;
		case "Exit":
			System.out.println("Exiting..");
			set = false;
			break;
		default:
				System.out.println("Give above options");
		}
	}
}}