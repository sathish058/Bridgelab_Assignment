package Day2_Assignment;
import java.util.Scanner;

/*@Author : Sathish
 * Code to find the sum of n Natural numbers using forLoop:
 */
		public class Sumof_Num_ForLoop {

	public static void main(String[] args) {
		int num, sum = 0;
		System.out.println("Enter a number :");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for (int i=1;i<=num;i++) {
			sum = sum +i;
		}
		System.out.println("Sum of Natural Numbers are :" +sum);

	}

}


