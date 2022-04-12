package day5_assignment;
/* Author :Sathish 
 * /* Author :Sathish 
 	Program to find the quotient and remainder*/
import java.util.Scanner;

public class Quotient_Remaider {
		  
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the Dividend number :");
	    	int dividend = sc.nextInt();
	    	System.out.println("Enter the Divisor Number :");
	    	int divisor = sc.nextInt();
	  
	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;
	  
	        System.out.println("The Quotient is = " + quotient);
	        System.out.println("The Remainder is = " + remainder);
	    }
	}


