
/*
program to understand nestedif
@author: Sandeep Shrivastava
date:19 Oct
*/

//import packages 
import java.util.Scanner;

//declaring a class
class NestedIfElsedemo2
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		char gender;
		
		//taking input
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			//taking input
			System.out.println("Enter your gender(m/f):");
		    gender= sc.next().charAt(0);
			
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			//checking weight criteria
			if(gender=='m')
			{
				if(weight>=60)
					System.out.println("You can donate the blood....");
				 else
				System.out.println("You are underweight.");
					
			}
			else
			{
				if(weight>=50)
					System.out.println("You can donate the blood....");
				 else
				System.out.println("You are underweight.");
				
			}
		   
			//end of nested ifelse
			
		}
		else
			System.out.println("You are underAge" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 