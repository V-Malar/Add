package Practice;
public class DoWhileLoop {
	static void display(int n)
	{
		System.out.println("\nData passed from Practice Class: " + n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean set = true;
		do
		{
			display(Practice.pass);
			System.out.println();
			int[] output = Practice.sort(new int[]{100, -3, 5, 0}); // Give your own input
			Practice.ascendingOrder(output);
			System.out.println();
			Practice.descendingOrder(output);
			System.out.println();
			Add.main(args);
			System.out.println();
			ASCIIValue.main(args);
			System.out.println();
			LargestNumber.find_large(3, -4, 1000); // Give your own input
			System.out.println();
			Multiple.multiple(5, 6); // Give your own input
			System.out.println();
			NestedForLoop.nest(4); // Give your own input
			System.out.println();
			OddOrEven.oddoreven(6); // Give your own input
			System.out.println();
			PrintNumber.print(7); // Give your own input
			System.out.println();
			PyramidExample.pyramid(4); // Give your own input
			System.out.println();
			PyramidExample.reverse_pyramid(4); // Give your own input
			System.out.println();
			PyramidExample.floyd(4); // Give your own input
			System.out.println();
			QuotientRemainder.display(5, -5);
			System.out.println();
			SwapTwoNumbersExercise.swap(4, -4);
			System.out.println();
			TypeCasting.main(args);
			System.out.println();
			Vowel.vowel_or_not('E');
			System.out.println();
			WhileLoopDemo.fibonacci(5);
			System.out.println();
			NestedSwitch.course_time("B.Sc", "ComputerScience");
			System.out.println();
			AreaCalculation.area(5);
			System.out.println();
			AreaCalculation.area(7, 5);
			System.out.println();
			AreaCalculation.area(0.5f, 3, 6);
			System.out.println();
			AreaCalculation.area(7);
//			System.out.println(Math.PI);
			String num = String.format("%.2f", Math.PI);
			Double i = Double.valueOf(num);
//			System.out.println(i instanceof Double);
			Double circle = i * 22 * 22;
			System.out.println(circle);
			System.out.println();
			set = false;
		}while(set);
		System.out.println("Practice Program executed successfully.");
	}
	

}
