package day6_junit;

import java.util.Scanner;

import util.util;

/* Author :Sathish 
 * /* Author :Sathish 
 * To calculate monthly payment for r interest and p principal for y years:
 */

public class Square_Root {
	public static void main(String[] args) throws Exception {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter no to find square root");
			double c = s.nextDouble();
			System.out.println("square root is " + util.sqrt(c));
			s.close();
		} catch (Exception e) {
			System.out.println("inter integer value "+e.getMessage());
		}

	}
}


