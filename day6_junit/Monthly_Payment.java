package day6_junit;

import java.util.Scanner;

import util.util;

/* Author :Sathish 
 * To calculate monthly payment for r interest and p principal for y years:
 * 
 */
		public class Monthly_Payment {
			public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double p = s.nextDouble();
		double y = s.nextDouble();
		double r = s.nextDouble();
		s.close();
		System.out.println("mothly payment is " + util.monthlyPayment(p, y, r));
	}
}

