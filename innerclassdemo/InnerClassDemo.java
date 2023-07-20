package innerclassdemo;

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pepsi pepsico=new Pepsi();
		//Cola cola=new Kalimark().new CampaCola();//this is how you access a non static inner class
		//pepsico.makePepsi(new Kalimark().stephenElop());
		
		
		Cola  cola=new Kalimark.CampaCola();//this is how you access a static inner class
		
		//kali.makeBovonto();

	}

}
abstract class Cola{
	public abstract void makeCola();
}
class Pepsi {
	public void makePepsi(Cola cola) {
		cola.makeCola();
		System.out.println("pepsi company fills in pepsi bottle and sells.....");
	}
}
class Kalimark {
	public void makeBovonto() {
//		class CampaCola extends Cola{
//			@Override
//			public void makeCola() {
//				System.out.println("campa cola makes cola...");
//			}
//		}
//		new CampaCola().makeCola();
		//anonymous inner class
		new Cola() {			
			@Override
			public void makeCola() {
				// TODO Auto-generated method stub
				System.out.println("campa cola cola is now made as kalimark cola...");
			}
		}.makeCola();
		System.out.println("kalimark company fills in bovonto bottle and sells.....");
	}
	
//	public Cola stephenElop() {
//		return new CampaCola();
//	}
	
	static class CampaCola extends Cola{
		@Override
		public void makeCola() {
			System.out.println("make cola from static campa cola class....");
		}
	}
}
