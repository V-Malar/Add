package Practice;

public class Vowel {
	static void vowel_or_not(char ch)
	{
		System.out.println(ch == 'A' || ch ==  'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' ? "Vowel" : "Consonant");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'V';
		vowel_or_not(ch);
	}

}
