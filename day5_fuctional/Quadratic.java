package day5_fuctional;
/* Author :Sathish 
 * /* Author :Sathish 
 	PRogram to find the quadratic*/
import java.util.Scanner;

public class Quadratic {

	/**
	 * Function to find the roots of equation and print it
	 * 
	 * @param a value of a
	 * @param b value of b
	 * @param c value of c
	 */
	static void roots(int a, int b, int c) {
		// calculating delta value
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);

	}

	/**
	 * Main method to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter a ");
			int a = s.nextInt();
			System.out.println("Enter b");
			int b = s.nextInt();
			System.out.println("Enter c");
			int c = s.nextInt();
			roots(a, b, c);
		} catch (Exception e) {
			System.out.println("Enter correct input");
		}
		s.close();
	}
}

