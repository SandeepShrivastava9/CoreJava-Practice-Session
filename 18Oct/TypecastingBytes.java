
/* Program to show typecasting with byte 
@author: Sandeep Shrivastava
Date:18 oct
*/

// import package
import java.util.Scanner;

// declaring a class
class TypecastingBytes
{
	
	public static void main (String args[])
	
	
	{
		
		
		//declaring byte data typecasting
		byte b1=19;
		byte b2=29;
		
		// calculating the sum
		
		byte cal= (byte) (b1 + b2);    // Typecasting because by default all the arithmatics operations gives integer output
		
		//printing the sum
		System.out.println("The cal Is : "+cal);
		
	}
// end of main

}

// end of class	