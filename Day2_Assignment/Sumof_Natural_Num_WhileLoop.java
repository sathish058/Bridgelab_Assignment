package Day2_Assignment;
/*@Author: Sathish
 * code to find the sum of N Natursl numbers using whileLoop
 */

import java.util.Scanner;

public class Sumof_Natural_Num_WhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= num) {
			sum = sum + i;
			i++;
		}
			System.out.println("Sum Of Natural Numbers are:" +sum);

	}

}



