package newwork;
class Sub
{
	public void display()
	{
		System.out.println("This is super.");
	}
}
public class SuperSub extends Sub{
	public void display()
	{
		System.out.println("This is sub.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSub s = new SuperSub();
		s.display();
	}

}
