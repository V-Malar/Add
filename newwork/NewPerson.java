package newwork;

// CLASS WITH CONSTRUCTOR

public class NewPerson {
	String name, address;
	int age;
	public NewPerson(String name)
	{
		this.name = name;
		getter1();
	}
	public NewPerson(String name, int age)
	{
		this.name = name;
		this.age = age;
		getter2();
	}
	public NewPerson(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		getter3();
	}
	public String getter1()
	{
		return "Name: " + name;
	}
	public String getter2()
	{
		return "Name: " + name + "\n" + "Age: " + age;
	}
	public String getter3()
	{
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewPerson p1 = new NewPerson("Person1");
		NewPerson p2 = new NewPerson("Person2", 23);
		NewPerson p3 = new NewPerson("Person3", 24, "2/24, 4th street, Chennai.");
		System.out.println();
		System.out.println(p1.getter1());
		System.out.println();
		System.out.println(p2.getter2());
		System.out.println();
		System.out.println(p3.getter3());
	}

}
