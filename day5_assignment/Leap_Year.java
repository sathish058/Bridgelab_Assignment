package day5_assignment;
/*Author : Sathish
 * code to check whether the year is Leap Year or not and the input should be 4 digit number:
 */

import java.util.Scanner;
public class Leap_Year {

public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Year");
    
    int year = sc.nextInt();
    
    if(year > 999 && year < 10000)
    {
        if(year %4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println(year+ "is a Leap Year");
                }
                else
                {
                    System.out.println(year+ "is Not a Leap Year");
                }
            }
            else
            {
                System.out.println(year+"is aLeap Year");
            }
        }
        else
        {
            System.out.println(year+ "is Not a Leap Year");
        }
    }
    else
    {
        System.out.println("Please! Enter valid Year");
    }
        	
     }
}

