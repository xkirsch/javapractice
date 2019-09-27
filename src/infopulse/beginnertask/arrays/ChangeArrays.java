//method for task Array51, Abramyan
package infopulse.beginnertask.arrays;

import java.util.Arrays;

public class ChangeArrays {
	public static void changeArrayAtoB(int[] arr, int[] arr1)	{
			for (int i = 0; i < arr.length; i++) {
				int tempvar = arr[i];
			    arr[i] = arr1[i];
			    arr1[i]=tempvar;
			}
			System.out.println("CHANGED ELEMENTS");
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arr1));
	}
		    
}
