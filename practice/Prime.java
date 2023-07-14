package Practice;

public class Prime {
	static void prime() {
		for (int i = 2; i <= 100; i++) {
			if ((i == 2) || (i % 2 == 1)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime();
	}

}
