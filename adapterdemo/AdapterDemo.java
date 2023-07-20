package adapterdemo;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class AdapterDemo {
	public static void main(String[] args) {
		AmericanPlugStandard lenovo = new LenovoPlug();

		IndianSocketStandard shakthisocket = new ShakthiSocket();

		// shakthisocket.roundPinHole(lenovo);

		IndianAdapterPlug indianPlug = new IndianAdapterPlug();
		indianPlug.americanPlug = lenovo;

		shakthisocket.roundPinHole(indianPlug);
	}
}
abstract class AmericanPlugStandard{
	public abstract void slabPin();
}
abstract class AmericanSocketStandard{
	public abstract void slabPinHole(AmericanPlugStandard plug);
}
abstract class IndianPlugStandard{
	public abstract void roundPin();
}
abstract class IndianSocketStandard{
	public abstract void roundPinHole(IndianPlugStandard plug);
}
class LenovoPlug extends AmericanPlugStandard{
	@Override
	public void slabPin() {
		System.out.println("american slab pin working...");
	}
}
class ShakthiSocket extends IndianSocketStandard{
	@Override
	public void roundPinHole(IndianPlugStandard plug) {
		plug.roundPin();		
	}
}
class IndianAdapterPlug extends IndianPlugStandard{
	AmericanPlugStandard americanPlug;
	@Override
	public void roundPin() {
		americanPlug.slabPin();
	}
}
