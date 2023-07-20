package newwork;

import java.io.DataInputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;

public class Cycle {

	public static void main(String bicycle[]) {
//		System.out.println(bicycle[0]);
//		File f = new File("/", "autoexec.bat");
//		DataInputStream d = new DataInputStream(System.in);
//		OutputStreamWriter o = new OutputStreamWriter(System.out);
//		RandomAccessFile r = new RandomAccessFile("OutFile");
		Detail d1=new Detail();
		d1.print();
	}

}
class Detail{
	private int roll=10;
	private String name="Anjali";
	
	public void print() {
		System.out.println(roll+" "+name);
	}

}
class Malhar extends Detail{
	public void print() {
		
	}
}
