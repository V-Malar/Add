package Practice;

public class TypeCasting {
	static void display(String myStr)
	{
		for (int i = 0; i < myStr.length(); i++)
		{
			System.out.println(myStr.charAt(i) + " " + (int)myStr.charAt(i));
		}
	}
	  public static void main(String[] args) {
	    int myNum = 5;               // integer (whole number)
	    float myFloatNum = 5.99f;    // floating point number
	    char myLetter = 'D';         // character
	    boolean myBool = true;       // boolean
	    String myStr = "Hello";		 // String
	    String myInt = "34";		 // String    
	    System.out.println(myFloatNum + " is " + ((Object)myFloatNum).getClass().getSimpleName() + " to " + ((Object)(int)myFloatNum).getClass().getSimpleName()+ " " + (int)myFloatNum);
	    System.out.println(myLetter + " is " + ((Object)myLetter).getClass().getSimpleName() + " to " + ((Object)(int)myLetter).getClass().getSimpleName() + " " + (int)myLetter);
	    System.out.println(myBool + " is " + ((Object)myBool).getClass().getSimpleName() + " to " + String.valueOf(myBool).getClass().getSimpleName() + " \"" + String.valueOf(myBool) + "\"");
	    System.out.println(myStr + " is " + ((Object)myStr).getClass().getSimpleName() + " to " + ((Object)(int)myStr.charAt(0)).getClass().getSimpleName());
	    display(myStr);
	    System.out.println(myNum + " is " + ((Object)myNum).getClass().getSimpleName() + " to " + ((Object)(byte)myNum).getClass().getSimpleName() + " " + (byte)myNum);
	    System.out.println(myFloatNum + " is " + ((Object)myFloatNum).getClass().getSimpleName() + " to " + ((Object)(byte)myFloatNum).getClass().getSimpleName() + " " + (byte)myFloatNum);
	    System.out.println(myInt + " is " + ((Object)myInt).getClass().getSimpleName() + " to " + Integer.valueOf(myInt).getClass().getSimpleName() + " " + Integer.valueOf(myInt));
	  }
	}

