package Practice;

public class Armstrong {
	static int perfect()
	{
	    int sum = 0, a = 28;
	    while (a > 0)
	        {
	            sum += a % 2;
	            System.out.println(a%2);
	            a--;
	        }
	    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, num;
		num = temp = 1634;
		int last, sum = 0;
		int count = String.valueOf(temp).length();
		while (temp > 0)
		{
			last = temp % 10;
			sum += Math.pow(last, count);
			temp = temp / 10;
		}
		if (sum == num)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number ");
		}
		System.out.println(perfect());
	}

}
