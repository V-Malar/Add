package overload;

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StructuredHuman gokul = new StructuredHuman();
		gokul.play(new VolleyBall());
	}

}

class Human {
	public void play(FootBall fb) {
		System.out.println("play by leg...");
	}

	public void play(VolleyBall vb) {
		System.out.println("play by hand....");
	}

	public void play(HockeyStick hs) {
		System.out.println("play with stick....");
	}
}

class StructuredHuman {
	public void play(Object obj) {
		if (obj instanceof FootBall) {
			System.out.println("play by leg......................................");
		} else if (obj instanceof VolleyBall) {
			System.out.println("play by hand......................................");
		} else if (obj instanceof HockeyStick) {
			System.out.println("play with stick....................................");
		}
	}
}

class FootBall {
}

class VolleyBall {
}

class HockeyStick {
}