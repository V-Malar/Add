package singletondemo;

public class SingleTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {			
			@Override
			public void run() {
				MySingleTon mys=MySingleTon.createObject();				
			}
		}).start();
		new Thread(new Runnable() {			
			@Override
			public void run() {
				MySingleTon mys=MySingleTon.createObject();				
			}
		}).start();
	}

}
class MySingleTon{
	private MySingleTon() {		
		System.out.println("mysingleton obj created...");
	}
	static MySingleTon obj;
	synchronized public static MySingleTon createObject() {
		if(obj==null) {			
			obj=new MySingleTon();
		}
		return obj;
	}
}