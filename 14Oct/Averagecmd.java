
/*
Program: To find the average of 2 number using command line.
@author: Sandeep Shrivastava.
@date: 15 October.
*/

//Declaring a class
class Averagecmd

{
	//main method
	public static void main (String args[])
	
	{
		
		// Declaring values
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		// Calculating the sum
		
		int sum =( number1 + number2 / 2 );
		System.out.println("The Average: "+sum); // To display the values
		
	}

// end of main

}	