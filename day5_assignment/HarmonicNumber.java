package day5_assignment;
/* Author :Sathish 
 * /* Author :Sathish 
		program to find the Harmonic Number */
import java.util.Scanner;

public class HarmonicNumber {
	/**
	 * Function to calculate the nth harmonic no
	 * 
	 * @param n the value of harmonic no
	 * @return
	 */
	static double harmonic(int n) {
		double h = 1;
		for (double i = 2; i <= n; i++) {
			h = h + 1 / i;
		}
		return h;
	}

	/**
	 * main method to test the class
	 * 
	 * @param ars
	 */
	public static void main(String[] ars) {
		Scanner s = new Scanner(System.in);
		/*
		 * try and catch to not terminate at wrong input
		 */
		try {
			System.out.println("Enter Harmonic number to find :");
			int n = s.nextInt();
			System.out.println(harmonic(n));

		} catch (Exception e) {
			System.out.println("Enter integer :");
			main(ars);
		}
		s.close();
	}
}


