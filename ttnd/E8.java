/*
 Convert the following code so that it uses nested while statements instead of for statements: 
	
 */
package ttnd;

public class E8 {

	public static void main(String[] args) {
		
		int s = 0; 
		int t = 1; 
		int i =0;
		
		while ( i < 10) 
		{ 
		   s = s + i; 
		   int j = i;
		   while ( j > 0) 
		{ 
		t = t * (j - i); 
		 j--;
		} 
		s = s * t; 
		System.out.println("T is " + t); 
		 i++;
		} 
		System.out.println("S is " + s);
	}

}