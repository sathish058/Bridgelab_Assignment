package Day3_Assignment;
/*Author :Sathish
 * code to find the Smallest Number in an array
 */

public class Smallest_Num_Array {

	public static void main(String[] args) {
		 //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initializing max with first element of array.  
        int min = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + min);


	}

}


