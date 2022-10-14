
/*
Programm: To Understand Command Line 
@author: Sandeep Shrivastava
@date: 14 October
*/


//declaring a class
class Additioncmd
{
	//main method
	public static void main (String args[])
	
	{
		//declaring value
		
		//int number1= Integer.parseInt(args[0]);
		//int number2= Integer.parseInt(args[1]);
		
		
		
		float number1= Float.parseFloat(args[0]);
		float number2= Float.parseFloat(args[1]);
		
		// calculating the sum
		float sum= number1+number2;
		System.out.println("The Sum is: "+sum);// for displaying the value
		
	}

   // end of main
}
//end of class   
		