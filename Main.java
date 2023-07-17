// class Super {
//   Super(int a) {
//     System.out.println("A: " + a);
//   }
// }

// class Main extends Super {
//   public Main() {
//     super(5);
//     }
    Main s= new Main(); 
//     public static void main(String args[])
//     {
//     }
//     }
class Base{ 
        Base(int i){ 
        System.out.println("base constructor " + i); 
        } 
        Base(){ 
        } 
} 
public class Main extends Base{ 
        public static void main(String argv[]){ 
             Main s= new Main(); 
        //One 
        } 
        Main() 
        { 
            super(5); 
        } 
        public void derived() 
        { 
            //Three 
        } }


