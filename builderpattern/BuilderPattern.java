package builderpattern;

public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer mycomputer=new Computer.RitchieStreet().
				setMonitor(new Monitor()).
				setCabin(new Cabin()).setMotherBoard(new MotherBoard()).build();
	System.out.println(mycomputer);
	}

}
class Computer{
	private Monitor samsung;
	private KeyBoard tvs;
	private Ram ddr;
	private HardDisk seaGate;
	private Cabin zeptron;
	private MotherBoard intel;
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	public Computer(RitchieStreet rs) {
		this.samsung=rs.samsung;
		this.tvs=rs.tvs;
		this.ddr=rs.ddr;
		this.seaGate=rs.seaGate;
		this.zeptron=rs.zeptron;
		this.intel=rs.intel;
	}
	
	@Override
	public String toString() {
		return "Computer [samsung=" + samsung + ", tvs=" + tvs + ", ddr=" + ddr + ", seaGate=" + seaGate + ", zeptron="
				+ zeptron + ", intel=" + intel + "] The total cost is...:"+totalCost();
	}
	int cost=0;
	private int totalCost() {
		
		if(samsung!=null) {
			cost=cost+samsung.cost;
		}
		if(tvs!=null) {
			cost=cost+tvs.cost;
		}
		if(ddr!=null) {
			cost=cost+ddr.cost;
		}
		if(seaGate!=null) {
			cost=cost+seaGate.cost;
		}
		if(zeptron!=null) {
			cost=cost+zeptron.cost;
		}
		if(intel!=null) {
			cost=cost+intel.cost;
		}
		return cost;
	}
	static class RitchieStreet{
		private Monitor samsung;
		private KeyBoard tvs;
		private Ram ddr;
		private HardDisk seaGate;
		private Cabin zeptron;
		private MotherBoard intel;
		
		public RitchieStreet setMonitor(Monitor m) {
			this.samsung=m;
			return this;
		}
		public RitchieStreet setKeyboard(KeyBoard m) {
			this.tvs=m;
			return this;
		}
		public RitchieStreet setRam(Ram m) {
			this.ddr=m;
			return this;
		}
		public RitchieStreet setHarddisk(HardDisk m) {
			this.seaGate=m;
			return this;
		}
		public RitchieStreet setCabin(Cabin m) {
			this.zeptron=m;
			return this;
		}
		public RitchieStreet setMotherBoard(MotherBoard m) {
			this.intel=m;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}
}
class Monitor{
	int cost=6000;
}
class KeyBoard{
	int cost=500;
}
class Ram{
	int cost=3000;
}
class Cabin{
	int cost=2000;
}
class HardDisk{
	int cost=5000;
}
class MotherBoard{
	int cost=8000;
}