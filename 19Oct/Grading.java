
/*
Programm: To Understand Command Line 
@author: Sandeep Shrivastava
@date: 14 October
*/


//import packages 
import java.util.Scanner;

//declaring a class
class Grading
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float percentage;
		char grade;
		
		//taking input
		System.out.println("Enter the percentage:");
		percentage= sc.nextFloat();
		
		
		//checking percentage to cal grade
		if(percentage>=85)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=55)
				    grade='C';
	                 else if(percentage>=40)
                           grade='D';
                           else
                             grade='F'; // assigning

						 
			   			
		//end of ifelse	
        if(grade=='F') // comparing
	      System.out.println("Fail.....Need to work hard!!!");
	   else
            System.out.println("Passed!!! with grade:"+grade);		   
	
		
		    
	}
		
	// end of main
}
// end of class 