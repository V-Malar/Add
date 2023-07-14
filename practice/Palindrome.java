package Practice;

public class Palindrome {
	static void palindrome(int str_i)
    {
		String str_o = String.valueOf(str_i);
        String str_r = "";
        System.out.println("\nCHECKING PALINDROME");
        System.out.println("*******************");
        for (int i = str_o.length() -1 ; i >= 0; i--)
            {
                str_r += str_o.charAt(i);
            }
        if (str_o.matches(str_r))
        {
        	System.out.println("\n" + str_o + " " + str_r);
        	System.out.println("PALINDROME");
        }
        else
        {
        	System.out.println("\n" + str_o + " " + str_r);
      		System.out.println("NOT PANLINDROME");
      	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome(1234321);
	}

}
