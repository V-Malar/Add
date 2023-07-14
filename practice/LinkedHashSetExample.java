package Practice;

import java.util.*;  
class Book {  
int id;  
String name,designation;  
int quantity;
int age;
int salary;  
public Book(int id, String name, int age, String designation, int salary) {  
    this.id = id;  
    this.name = name;  
    this.age = age;  
    this.designation = designation;  
    this.salary = salary;  
}  
}  
public class LinkedHashSetExample {  
	static void display(LinkedHashSet<Book> hs)
	{
		for(Book b:hs){  
		    System.out.println("ID: " + b.id + " " + b.name+" "+b.age+" "+b.designation+" "+b.salary);  
		    }  
	}
	static void edit(int id, LinkedHashSet<Book> hs)
	{
		Scanner sc = new Scanner(System.in);
		String the_edit, edit_name, edit_designation;
		int edit_salary, edit_age;
		for(Book b:hs){  
		    if (id == b.id)  
		    {
		    	System.out.println("Enter the field to be edited: ");
		    	the_edit = sc.next();
		    	System.out.println("Name");
		    	System.out.println("Age");
		    	System.out.println("Designation");
		    	System.out.println("Salary");
		    	System.out.println("Exit");
		    	switch(the_edit)
		    	{
		    	case "Name":
		    		System.out.println("Enter Replaced Name: ");
		    		edit_name = sc.next();
		    		b.name = edit_name;
		    		break;
		    	case "Age":
		    		System.out.println("Enter Replaced Age: ");
		    		edit_age = sc.nextInt();
		    		b.age = edit_age;
		    		break;
		    	case "Designation":
		    		System.out.println("Enter Replaced designation: ");
		    		edit_designation = sc.next();
		    		b.designation = edit_designation;
		    		break;
		    	case "Salary":
		    		System.out.println("Enter Replaced salary: ");
		    		edit_salary = sc.nextInt();
		    		b.age = edit_salary;
		    		break;
		    	case "Exit":
		    		System.out.println("No change... Exiting...");
		    		System.exit(0);
		    		default:
		    			System.out.println("No data");
		    	}
		    }
		    }  
		display(hs);
	}
public static void main(String[] args) {  
    LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
    Scanner sc = new Scanner(System.in);
    String name, designation;
    int i = 1, n, age, salary, id;
    int UNIQUE_ID = 1;
    System.out.println("Enter the number of users:");
    n = sc.nextInt();
    while (i <= n)
    {
    	System.out.println("Enter Name: ");
    	name = sc.next();
    	System.out.println("Enter Age: ");
    	age = sc.nextInt();
    	System.out.println("Enter Designation: ");
    	designation = sc.next();
    	System.out.println("Enter Salary: ");
    	salary = sc.nextInt();
    	Book b =new Book(i + UNIQUE_ID, name, age, designation, salary);  
    	hs.add(b);
    	i++;
    }
//    //Creating Books  
//    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
//    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
//    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
//    //Adding Books to hash table  
//    hs.add(b1);  
//    hs.add(b2);  
//    hs.add(b3);  
//    //Traversing hash table  
    display(hs);
    System.out.println("Enter ID: ");
	id = sc.nextInt();
    edit(id, hs);
}  
}  
