package fandemo;

import java.util.Scanner;

public class FanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadFan shaitan = new BadFan();
//		Scanner scan=new Scanner(System.in);
//		while(true) {
//			shaitan.pull();
//			scan.next();
//		}
		GoodFan khaitan = new GoodFan();
		Scanner scan = new Scanner(System.in);
		while (true) {
			khaitan.pull();
			scan.next();
		}
	}

}
class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			state=1;
			System.out.println("switch on state....");
		}
		else if(state==1) {
			state=2;
			System.out.println("low speed state....");
		}
		else if(state==2) {
			state=3;
			System.out.println("medium speed state....");
		}
		else if(state==3) {
			state=4;
			System.out.println("high speed state....");
		}
		else if(state==4) {
			state=0;
			System.out.println("switch off speed state....");
		}
	}
}
class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract  void pull(GoodFan fan);
}
class SwitchOffState extends State{
	@Override
	public void pull(GoodFan fan) {
		fan.state=new SwitchOnState();
		System.out.println("switch on state.....");
	}
}
class SwitchOnState extends State{
	@Override
	public void pull(GoodFan fan) {
		fan.state=new LowSpeedState();
		System.out.println("Low Speed state.....");
	}
}
class LowSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		fan.state=new MediumSpeedState();
		System.out.println("Medium Speed state.....");
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		fan.state=new HighSpeedState();
		System.out.println("High Speed state.....");
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		fan.state=new SwitchOffState();
		System.out.println("swith off state.....");
	}
}
