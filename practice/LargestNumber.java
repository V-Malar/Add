package Practice;

public class LargestNumber {
	static void find_large(int n1, int n2, int n3)
	{
		System.out.println(n1 > n2 ? n1 > n3 ? n1 + " - n1 is biggest." : n3 + " - n3 is biggest." : n2 + " - n2 is biggest.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 30, n2 = 20, n3 = 40;
		find_large(n1, n2, n3);
	}

}
