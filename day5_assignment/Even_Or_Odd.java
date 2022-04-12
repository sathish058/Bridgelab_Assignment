package day5_assignment;
/* Author :Sathish 
 * /* Author :Sathish 
 * program to find the Odd Or Even
 */
	import java.io.*;
	import java.util.Scanner;
	public class Even_Or_Odd {

		public static void main(String[] args)
		{
			System.out.println("Enter Number:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			// Checking if number is even or odd number
			// via remainder
			if (num % 2 == 0) {

				// If remainder is zero then this number is even
				System.out.println("Entered Number is Even");
			}

			else {

				// If remainder is not zero then this number is
				// odd
				System.out.println("Entered Number is Odd");
			}
		}
	}
