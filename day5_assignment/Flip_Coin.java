package day5_assignment;
/* Author :Sathish 
 * /* Author :Sathish 
  program to find the flip coin */ 

import java.util.Random;

public class Flip_Coin {

	public static void main(String[] args) {
		
		int HeadCounter=0;
		int TailCounter=0;
		
		for(int i=0;i<10;i++) {
		Random random = new Random();
		int number = random.nextInt(2);
		
		if(number == 0) {
			System.out.println("Heads");
			 HeadCounter++;
		}
		else if (number == 1){
			System.out.println("Tails");
			TailCounter++;
		}
		int percentage = (HeadCounter * 10) / 100;
		System.out.println(+percentage);
	
		}
		
	}

}
