package Day2_Assignment;
/* Author : Sathish 
 * code to find the given season spring or not
 */

public class Spring_Season {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[3]);
        int day   = Integer.parseInt(args[20]);
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);

	}

}


