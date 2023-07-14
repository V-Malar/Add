package newwork;

abstract class Shape {
	abstract void calculateArea();
}

class Rectangle extends Shape{
	int l, b;
	Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	void calculateArea() {
		System.out.println("\nLength: " + l + " Breadth: " + b + "\nArea of Rectangle: " + (l * b));
	}
}

class Circle extends Shape{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	void calculateArea() {
		double pi = 3.14;
		System.out.println("\nArea of Circle: " + pi * r * r);
	}
}

class Shapes extends Shape{
	void calculateArea() {
		System.out.println("Calculated Area for Rectangle and Circle");
	}
	public static void main(String args[]) {
		Shapes s = new Shapes();
		s.calculateArea();
		Shape r = new Rectangle(4, 5);
		r.calculateArea();
		Shape c = new Circle(4.0);
		c.calculateArea();
	}
}