package Day2_Assignment;
/*@Author : Sathish
 * code to find the given Alphabet is Vowel or Consonant:
 */

import java.util.Scanner;


public class Vowels_Consonants {

	public static void main(String[] args) {
		System.out.println("Enter a Alphabet :");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
			switch (ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("The Alphabet is Vowel.");
					break;
				default :
					System.out.println("The Alphabet is Consonant.");
					break;
			}
	  }

}


