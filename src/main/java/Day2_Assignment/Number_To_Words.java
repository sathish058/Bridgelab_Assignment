package Day2_Assignment;
/*@Author : Sathish
 * Code to get single digit number in word:
 */

import java.util.Scanner;

public class Number_To_Words {

	public static void main(String[] args) {
		System.out.println("Enter a single digit number:");
		Scanner sc = new Scanner(System.in);
		
				int num = sc.nextInt();
		if (num == 0) {
			System.out.println("ZERO");
		}
		if(num == 1) {
			System.out.println("ONE");
		}
		if (num == 2) {
			System.out.println("TWO");
		}
		if (num == 3) {
			System.out.println("THREE");
		}
		if (num == 4) {
			System.out.println("FOUR");
		}
		if (num == 5) {
			System.out.println("FIVE");
		}
		if (num == 6) {
			System.out.println("SIX");
		}
		if (num == 7) {
			System.out.println("SEVEN");
		}
		if (num == 8) {
			System.out.println("EIGHT");
		}
		if (num == 9) {
			System.out.println("NINE");
		}
		else
		{
	
		System.out.print("Please,Enter a single digit number:");
	}

	}

}


