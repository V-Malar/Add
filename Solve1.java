package Week;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Shinchans {
	Socket s;
	BufferedReader in, keyin;
	PrintStream out;
	String msg;

	public Shinchans() {
		try {
			while (true) {
				s = new Socket("localhost", 2023);
				Thread t = Thread.currentThread();
				String name = t.getName();
				System.out.println(name + " is running...");
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromServer = in.readLine();
				System.out.println("Msg From Server...(Shinchan Server):" + msgFromServer);
				msg = msgFromServer;
				out = new PrintStream(s.getOutputStream());
				keyin = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter message for server(Shinchan Server)...:");
				String msg = keyin.readLine();
				out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getShinchan() {
		System.out.println("Your message: " + msg);
	}
//	public static void main(String[] args) {
//		new Shinchans();
//	}
}

class Shirou {
	Socket s;
	BufferedReader in, keyin;
	PrintStream out;
	String msg;

	public Shirou() {
		try {
			while (true) {
				s = new Socket("localhost", 2023);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromServer = in.readLine();
				System.out.println("Msg From Server...(Shiro Server):" + msgFromServer);
				msg = msgFromServer;
				out = new PrintStream(s.getOutputStream());
				keyin = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter message for server...(Shiro Server):");
				String msg = keyin.readLine();
				out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getShiro() {
		System.out.println("Your message: " + msg);
	}

//	public static void main(String[] args) {
//		new Shirou();
//	}
}

public class DidIt {
	ServerSocket ss;
	Socket s;
	PrintStream out;
	BufferedReader in, keyin;

	public DidIt() {
		try {
			ss = new ServerSocket(2023);
			while (true) {
				System.out.println("Server running....");
				ExecutorService es = Executors.newFixedThreadPool(2);
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter choice: ");
				String name = sc.next();
				switch (name) {
				case "Shinchan": {
					es.execute(new Runnable() {
						@Override
						public void run() {
							{// class lock
								Thread.currentThread().setName("Shinchan");
								new Shinchans();
							}
						}
					});
					break;
				}
				case "Shiro": {
					es.execute(new Runnable() {
						@Override
						public void run() {
							{
								Thread.currentThread().setName("Shirou");
								new Shirou();
							}
						}
					});
					break;
				}
				case "All": {
					es.execute(new Runnable() {
						@Override
						public void run() {
							{
								Thread.currentThread().setName("All");
								new Shinchans().getShinchan();
								new Shirou().getShiro();
							}
						}
					});
					break;
				}
				default:
					System.out.println("No match...ReEnter..");
				}
				es.shutdown();

				s = ss.accept();
				out = new PrintStream(s.getOutputStream());
				keyin = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter message for client...:");
				String msg = keyin.readLine();
				out.println(msg);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromClient = in.readLine();
				System.out.println("Msg From Client..:" + msgFromClient);
				// System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new DidIt();
	}
}
