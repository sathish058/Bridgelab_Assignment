package Day2_Assignment;
/*@Author : Sathish
 * Code to find the unit,Hundred,thousand for given number:
 */

import java.util.Scanner;

public class Value_Of_Digit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter four Digit numbers:");
		
		int num = scanner.nextInt();
		int unit = num % 10;               // unit=1234 %10 = 4
		int tens = num % 100 / 10;         // tens=1234 %100 = 34/10 = 3 
		int hundred = num % 1000 / 100;     //hun =1234 %1000 = 234 /100= 2
		int thousand = num % 10000 / 1000;  // tho = 1234%10000= 1234/1000=1
		
		System.out.println("The number in the Unit is : " +unit);
		System.out.println("The number in the Tens is : " +tens);
		System.out.println("The number in the Hundreds is : " +hundred);
		System.out.println("The number in the Thousands is : " +thousand);
    }

}


