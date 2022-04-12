package day5_fuctional;

/* Author :Sathish 
 * /* Author :Sathish 
 	Program to find the sum of 3 integer*/
import java.util.Scanner;

public class Sum_Of_3_Integer_Adds_To_Zero {

	/*
	 * static scanner to take input from different methods
	 */
	static Scanner s = new Scanner(System.in);

	/**
	 * function to check sum of triplets is 0
	 * 
	 * @param n the no of elements to check for for creation of array
	 */
	static void sum0count(int n) {
		int[] arr = new int[n];
		int count = 0;
		System.out.println("Enter values");
		// taking integer input for creating array
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		// checking for triplets by loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		// output
		System.out.println("total pairs are " + count);

	}

	public static void main(String[] args) {

		System.out.println("Enter no of inputs");
		int n = s.nextInt();
		sum0count(n);

	}
}

