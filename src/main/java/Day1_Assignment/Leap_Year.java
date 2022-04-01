package Day1_Assignment;
/* @Author : Sathish
 * code to check the year is Leap or not:
 */

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		System.out.println("Enter a Year:");
		Scanner sc = new Scanner(System.in);
	
		int year = sc.nextInt(); 
		
	       if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
	               System.out.println("Year " + year + " is a leap year.");
	       else
	               System.out.println("Year " + year + " is not a leap year.");

	}

}


