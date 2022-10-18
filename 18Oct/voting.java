
/*
Program: To check voting age.
@author: Sandeep Shrivastava.
date: 18 oct.
*/


// import package
import java.util.Scanner;

//declaring a class
class voting

{

 

    public static void main(String[] args)
	
	{
        int age;// declaring int and intiliazing 
		
        Scanner input = new Scanner(System.in);
                        
        System.out.print("Please enter your age: "); 
        age = input.nextInt();
                           
        if(age>=18)                                                          // ifelse statement 
		{
            System.out.println("You have the right to vote.");
        }
        else
		{
            System.out.println("Sorry, you are not eligible to vote.");
        }
    }

	// end of main
	
}
// end of class