package Practice;

public class SwapTwoNumbersExercise {
	static void swap(int a, int b)
	{
		System.out.println("\nBefore swap:\nA - " + a + "\nB - " + b + "\n\nAfter swap:\nA - " + ((a + b) - a) + "\nB - " + ((a + b) - b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = -10;
		swap(a, b);
	}

}
