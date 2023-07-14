package newwork;

// CLASS WITH INHERITANCE AND POLYMORPHISM

class Employee extends Person{
	String name, address;
	int age;
	int employeeID, salary;
	public void setter(int employeeID, int salary)
	{
		this.employeeID = employeeID;
		this.salary = salary;
	}
	public String getter()
	{
		return "Employee ID: " + employeeID + "\nSalary: " + salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person();
//		p.setter("V", 27, "Here");
//		p.getter();
		Employee e = new Employee();
		e.setter(12, 12000);
		System.out.println(e.getter());		
	}

}
