
/*
program to print result
@author: sandeep shrivastava
date: 19 oct
*/

//declaring a class
class Result
{
	//main started
	public static void main(String args[])
	{
		float marks1,marks2,marks3,percentage;
		
		//taking input
		marks1= Float.parseFloat(args[0]);
		marks2= Float.parseFloat(args[1]);
		marks3= Float.parseFloat(args[2]);
		
		//calculating percentage
		percentage= ((marks1+marks2+marks3)/300)*100;
		
		//checking the student has cleared the exam or not
		
		if(percentage>=40)
			System.out.println("Congratulations!! Passed!! ");
		else
			System.out.println("Try Harder ");
		
		//end of ifelse
		    
	}
		
	// end of main
}
// end of class 