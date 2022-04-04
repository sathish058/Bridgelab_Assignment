package Day2_Assignment;
/*Author: Sathish
 * code to find Maximum and Minimum Value between two numbers:
 */
import java.util.Scanner;

public class Max_Or_Min {
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num1,num2;
		System.out.println("Enter Two Numbers :  ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		int Maximum;
		Maximum = Math.max(num1, num2);
		System.out.println("The Maximum number is : " +Maximum);
		
		int Minimum;
		Minimum= Math.min(num1, num2);
		System.out.println("The Minimum number is : " +Minimum);
		
	}

}


