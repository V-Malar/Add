package Practice;

import java.util.Scanner;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  int a, count = 0;
		  String place = "\0";
		  System.out.print("Enter the number : ");
		  a = sc.nextInt();
		  int[] arr = {1,2,3,4,3,5,3,3,3};
		  
		    for (int i = 0; i < arr.length; i++)
		    {
		    	if (a == arr[i])
		        {
		        	count += 1;
		        	place += String.valueOf(i) + " "; 
		        }
		    }
		    if (count <= 0)
		    {
		    	System.out.println("This element is not found.");
		    }
		    else
		    {
		    	System.out.println("The element is found in " + place + " with " + count + " count.");
		    }
		  }
}
