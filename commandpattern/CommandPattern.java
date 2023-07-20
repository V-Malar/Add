package commandpattern;

public class CommandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ESeva seva=new ESeva();
		
		Hospital hospital=new Hospital();
		Police police=new Police();
		Corporation corporation=new Corporation();
		Airline airline=new Airline();
		
		Command bodyTransferCommand=new DeadBodyTransport(hospital,police,corporation,airline);
		
		seva.setCommand(bodyTransferCommand, 1);
		
		seva.executeCommand(1);
	}

}
class Hospital{
	public void releaseBody() {
		System.out.println("dead body released...");
	}
	public void doEmbalm() {
		System.out.println("dead body embalmed...");
	}
}
class Police{
	public void legalClearance() {
		System.out.println("police start investigation..");
		System.out.println("police cleared the process...");
	}
}
class Corporation{
	public void deathCertificate() {
		System.out.println("corporation releases death certificate...");
	}
}
class Airline{
	public void transportBody() {
		System.out.println("body transported via air...");
	}
}
abstract class Command{
	public abstract void execute();
}
class DeadBodyTransport extends Command{
	public DeadBodyTransport() {
		// TODO Auto-generated constructor stub
	}
	Hospital hospital;
	Police police;
	Corporation corporation;
	Airline airline;
	public DeadBodyTransport(Hospital hospital,Police police,Corporation corporation,Airline airline) {
		this.hospital=hospital;
		this.police=police;
		this.corporation=corporation;
		this.airline=airline;
	}
	
	@Override
	public void execute() {
		System.out.println("The dead body transport job started...");
		hospital.releaseBody();
		hospital.doEmbalm();
		police.legalClearance();
		corporation.deathCertificate();
		airline.transportBody();
		System.out.println("Process over....");
	}
}
class ESeva {
	Command commands[]=new Command[5];
	public ESeva() {
		for(int i=0;i<commands.length;i++) {
			commands[i]=new Command() {				
				@Override
				public void execute() {
					System.out.println("I am dummy command.....");
				}
			};
		}
	}
	public void setCommand(Command c,int slot) {
		commands[slot]=c;
	}
	public void executeCommand(int slot) {
		commands[slot].execute();
	}
}