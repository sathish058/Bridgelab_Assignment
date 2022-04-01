package Day1_Assignment;
/*@Author : Sathish
* code to check whether the sting is equal or not
 */

import java.util.Scanner;

public class Equal_String {

	public static void main(String[] args) {
		 String str1, str2;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter First String :"); 
			str1 = sc.nextLine();
			
			System.out.println("Enter Second String :");
			str2 = sc.nextLine();
			
			if(str1.equals(str2))
				System.out.println("The String are Equal");
			else
				System.out.println("The Strings are not Equal");
				}

	}



