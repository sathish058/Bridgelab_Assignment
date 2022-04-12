package day5_assignment;
/* Author :Sathish 
 * /* Author :Sathish 
 	program to find the Largest of three numbers*/
import java.util.Scanner;

public class Largest_3Numbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int num1,num2,num3;
	System.out.println("Enter First Number: ");
	num1=sc.nextInt();
	System.out.println("Enter Second Number:");
	num2=sc.nextInt();
	System.out.println("Enter Third Number:");
	num3=sc.nextInt();
		
	

    if( num1 >= num2 && num1 >= num3)
        System.out.println(num1 + " is the largest number.");

    else if (num2 >= num1 && num2 >= num3)
        System.out.println(num2 + " is the largest number.");

    else
        System.out.println(num3 + " is the largest number.");
}
}

