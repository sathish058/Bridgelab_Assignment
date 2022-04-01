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
			
			System.out.println("The Operator of a+b*c = " +oper1); 
			System.out.println("The Operator of c+a/b = " +oper2);
			System.out.println("The Operator of a%b+c = " +oper3);
			System.out.println("The Operator of a*b+c = " +oper4);
			}

}


