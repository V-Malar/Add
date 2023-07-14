package Practice;

public class WhileLoopDemo {
	static void fibonacci(int n)
	{
		int n1 = 0, n2 = 1, result = 0;
		int i = 1;
		System.out.println(n1);
		System.out.println(n2);
		while (i < n-1)
		{
			result = n1 + n2;
			System.out.println(result);
			n1 = n2;
			n2 = result;
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(5);
	}

}
