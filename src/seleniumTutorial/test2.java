package seleniumTutorial;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
	
		
		int [] array1 = {2,5,4,3,1};
		int []array2 = {50,20,40,10,30};
		
		   int a= array1.length;
		    int b= array2.length;
		    
		    int []result = new int [a + b];
		    
		    System.arraycopy(array1, 0, result, 0, a);
		    System.arraycopy(array2, 0, result, a, a);
		    
		  System.out.println(  Arrays.toString(result));
				
				
		
				
				

	}

}
