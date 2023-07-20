package newwork;

import java.io.*;
class Base{
public static void amethod()throws FileNotFoundException{}
}
public class Main extends Base{
public static void main(String argv[]){
Main e = new Main();
}
public static void amethod(){}
protected Main(){
try{
DataInputStream din = new DataInputStream(System.in);
System.out.println("Pausing");
din.readChar();
System.out.println("Continuing");
amethod();
}catch(IOException ioe) {}
}
}
