package newwork;

// CLASS WITH SETTER AND GETTER

public class PersonCount {
	String name, address;
	int age;
	static int count = 0;
	public void setter(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		count += 1;
	}
	public String getter()
	{
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address;
	}
	static void display()
	{
		System.out.println("Displays: " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i <= 7; i++)
//		{
//			Character c;
//			c = Character.valueOf((char)i);
		PersonCount  A = new PersonCount();
		A.setter("Person", 23, "2/22, 2nd street, Chennai.");
		A.setter("Person", 24, "2/22, 2nd street, Chennai.");
		A.setter("Person", 25, "2/22, 2nd street, Chennai.");
		A.setter("Person", 26, "2/22, 2nd street, Chennai.");
		A.setter("Person", 27, "2/22, 2nd street, Chennai.");
		A.setter("Person", 28, "2/22, 2nd street, Chennai.");
		A.setter("Person", 29, "2/22, 2nd street, Chennai.");
		A.setter("Person", 30, "2/22, 2nd street, Chennai.");
		System.out.println(A.getter());
		display();
//		System.out.println(count);
	}
}
