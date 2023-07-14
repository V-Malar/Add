package newwork;

// CLASS WITH SETTER AND GETTER

public class Person {
	String name, address;
	int age;
	public void setter(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getter()
	{
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setter("Person", 23, "2/22, 2nd street, Chennai.");
		System.out.println(p.getter());
	}

}
