
/* Program to show typecasting
@author: Sandeep Shrivastava
Date:18 oct
*/

// import package
import java.util.Scanner;

// declaring a class
class Typecasting
{
	
	public static void main (String args[])
	
	
	{
		
		
		//declaring short data typecasting
		short s1=79;
		short s2=29;
		
		// calculating the sum
		short sum;
		sum= (short) (s1 + s2);// Typecasting because by default all the arithmatics operations gives integer output
		
		//printing the sum
		System.out.println("The Sum Is : "+sum);
		
	}
// end of main

}

// end of class	