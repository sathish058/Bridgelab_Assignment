package Day1_Assignment;
/* Author :Sathish
 * code to get the sum of command line arguments:
 */

public class Sum_Of_CmndLine_Args {

	public static void main(String []values) {
		int n, count=0, sum=0;
		for(int i=0;i<values.length;i++)
		{
		try
		{
		n=Integer.parseInt(values[i]);
		sum= sum+n;
		}
		catch (NumberFormatException e)
		{
		System.out.println("invalid integer:");
		count++;
		}
		}
		System.out.println("Sum of only valid integers is= "+sum) ;

		System.out.println("Invalid integers are: "+count) ;

	}

}


