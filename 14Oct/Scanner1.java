
/*
Program: To Understand the Input using Scanner
@author: Sandeep Shrivastava
@date: 14 October
*/

//importing util package for Scanner class
import java.util.Scanner;

//declaring a class
class Scanner1
{// it is used for inputing data by user
       
	   //main method
	   public static void main(String args[])
	   {
		   //creating object of Scanner class
		   Scanner s1 = new Scanner(System.in);
		   
		   //declaring and intilializing local variables
		   System.out.println("Enter Your Name: ");
		   String name= s1.next();// to take string input value
		   
		   ////////////////////////////////////////////////////////////////////////////////
		   
		   System.out.println("Enter Your Age: ");
		   int age= s1.nextInt();// to take integer input value
		   
		   
		   ////////////////////////////////////////////////////////////////////////////////
		   
		   System.out.println("Enter Your Marks: ");
		   float marks= s1.nextFloat();// to take float input value
		   
		   ////////////////////////////////////////////////////////////////////////////////
		   
		   System.out.println("Enter Your Gender(M/F): ");
		   char gender= s1.next().charAt(0);// to take character input value
		   
		   
		   ////////////////////////////////////////////////////////////////////////////////
		   
		   System.out.println("Enter Your Pass/Fail: ");
		   boolean pass= s1.nextBoolean();// to take Boolean input value
		   
		   
		   ////Printing the Values
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");   
		System.out.println("Your Details are: ");   
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
		System.out.println("Pass: "+pass);
	   }
		//end of main
		}
		//end of class Result  
		
		