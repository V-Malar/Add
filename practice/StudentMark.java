package Practice;

public class StudentMark1 {
	public static void main(String[] args) {
	    int[][] a = {{1, 2, 3, 5, 1},
	    			 {4, 5, 6, 6, 10}};
	    
	    for (int i = 0; i < a.length; i++)
	    {
	    	int marks = 0;
	    System.out.println("Student : " + (i + 1));
	    	for (int j = 0; j < a[i].length; j++)
	        {
	        marks = marks + a[i][j];
	        }
	        System.out.println("Marks: " + marks);
	    }
	  }
	}