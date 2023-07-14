package Practice;

public class Large {
	public static void main(String[] args) {
	    int[][] a = {{1, 2, 3, 5, 1},
	    			 {4, 5, 6, 6, 10}};
	    int temp;
	    for (int i = 0; i < a.length; i++)
	    {
	    	int max = a[i][0];
	    System.out.println("Row : " + (i + 1));
	    	for (int j = 0; j < a[i].length; j++)
	        {
	        if (a[i][j] > max)
	        {
	        	max = a[i][j];
	        }
	        }
	    	System.out.println(max);
//	        System.out.println("Marks: " + marks);
	    }
}
}