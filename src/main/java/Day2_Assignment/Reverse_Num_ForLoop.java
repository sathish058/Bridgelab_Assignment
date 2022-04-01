package Day2_Assignment;
/*@Author : Sathish
 * Code to Reverse the Given Number using ForLoop:
 */

import java.util.Scanner;

public class Reverse_Num_ForLoop {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		int rev = 0, num;
		Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
		
		for(;num != 0; num = num / 10) {
			int remainder = num % 10;
			rev =rev * 10 + remainder;
			}
		System.out.println("The Reversed Number is :" +rev);

	}

}



