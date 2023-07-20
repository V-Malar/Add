package newwork;

public class Fan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object ob = new Object();
//		ob = new SOS();
		new Stage().view(new SOS());
//		s.view(new SOS());
	}
}

class Stage {
	public Stage view(Select s) {
		s.speed();
		return this;
	}
}

abstract class Select {
	abstract public void speed();
}

class SOS extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in OFF state.");
	}
}

class SON extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in ON state.");
	}
}

class One extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in I state.");
	}
}

class Two extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in II state.");
	}
}

class Three extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in III state.");
	}

}