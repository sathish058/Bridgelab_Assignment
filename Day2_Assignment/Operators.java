package Day2_Assignment;
/*@Author: Sathish
 * Code to find operators:
 * i) a+b*c ii) c+a/b
    iii) a%b+c iV) a*b+c
 */
import java.util.Scanner;

		public class Operators {
			public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,oper1,oper2,oper3,oper4;
		System.out.println("Enter First Number:");
		 num1=sc.nextInt();
		 
			System.out.println("Enter Second Number:");
			num2=sc.nextInt();
			
			System.out.println("Enter Third Number:");
			num3=sc.nextInt();
			
			oper1=(num1+num2)*num3; // a+b*c
			oper2=(num3+num1)/num2; // c+a/b
			oper3=(num1%num2)+num3; // a%b+c
			oper4=(num1*num2)+num3; // a*b+c
		
			int max1 = Math.max(oper1,oper2);
			int max2 = Math.max(oper3, oper4);
			int maximum = Math.max(max1, max2);
			
			System.out.println("The Maximum number is : " +maximum);
			
			int min1 = Math.min(oper1,oper2);
			int min2 = Math.min(oper3, oper4);
			int minimum = Math.min(max1, max2);
			
			System.out.println("The Minimum number is : " +minimum);
			
			
			}
}


