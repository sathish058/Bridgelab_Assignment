package Day2_Assignment;
/*@Author : Sathish
 * Code to Reverse the Given Number Using While Loop: 
 */

import java.util.Scanner;

public class Reverse_Integer {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The reversed number is : " +rev);
		}

}


