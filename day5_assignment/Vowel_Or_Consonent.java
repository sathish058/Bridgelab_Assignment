package day5_assignment;
/* Author :Sathish 
 * /* Author :Sathish 
 	Progrsm to find the albapet is vowel or consonent*/
import java.util.Scanner;

public class Vowel_Or_Consonent {
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
	