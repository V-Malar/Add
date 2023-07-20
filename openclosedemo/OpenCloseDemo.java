package openclosedemo;

public class OpenCloseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodPaintBrush gp=new GoodPaintBrush();
		gp.doPaint(new BluePaint());
	}

}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red paint.....");
		}
		else if(i==2) {
			System.out.println("blue paint....");
		}
	}
}
class GoodPaintBrush{
	public void doPaint(Paint p) {
		p.color();
	}
}
abstract class Paint{
	public abstract void color();
}
class RedPaint extends Paint{
	@Override
	public void color() {
		System.out.println("red colour...");
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		System.out.println("blue colour....");
	}
}
/*
 * Trick to remove if-else-if conditions
 * 1. Convert the condition to classes
 * 2. Place them under a hierarchy
 * 3. Create a association between the hierarchial class and the using class
 */