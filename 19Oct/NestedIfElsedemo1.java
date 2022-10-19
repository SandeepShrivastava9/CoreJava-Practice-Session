
/*
program to understand nestedif
@author: Sandeep Shrivastava
date:19 Oct
*/

//import package
import java.util.Scanner;

//declaring a class
class NestedIfElsedemo1
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		
		//taking input
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			//checking weight criteria
			if(weight>=50)
				System.out.println("You can donate the blood....");
		    else
				System.out.println("You are underweight...");
			//end of nested ifelse
			
		}
		else
			System.out.println("You are underAge" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 