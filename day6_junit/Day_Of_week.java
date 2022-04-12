package day6_junit;
/* Author :Sathish 
 * /* Author :Sathish 
 		Program to find day of week*/
import java.util.Scanner;

import util.util;

public class Day_Of_week {
	
	
 /**
  *    main function to test the class
  */
	public static void main(String[] args) {
		int d, m, y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Date in day Month year (Example: 01 03 2000)");
		d = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
		System.out.println("day is "+util.dayOfWeek(d, m, y));
		s.close();
		
	}
}

