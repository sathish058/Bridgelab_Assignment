package Day2_Assignment;
/*@Author : Sathish
 * Code to find the number is Palindrome or not:
 */

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int org_num=num;
	    int rev = 0;
		
		for(;num != 0; num = num / 10) {
			int remainder = num % 10;
			rev =rev * 10 + remainder;
			}
		if(org_num == rev) {
			System.out.println(org_num + "is Palindrome");
		}
		else {
			System.out.println(org_num +   "is not a Palindrome");
		}

	}

}


