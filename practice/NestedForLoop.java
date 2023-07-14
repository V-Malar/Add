package Practice;

public class NestedForLoop {
	static void nest(int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.println();
			for (int j = 1 ; j <= n ; j++)
			{
				System.out.print(" " + i + "" + j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nest(3);
	}

}
