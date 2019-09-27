//method for task Array7, Abramyan
package infopulse.beginnertask.arrays;

import java.util.Arrays;

public class InverseArray {
	public static void inverseArray(int[] arr) {                               
	    int arrayLength = arr.length;
		int tempVar;
		for (int i = 0; i < arrayLength/2; i++) {
		    tempVar = arr[arrayLength-i-1];
		    arr[arrayLength-i-1] = arr[i];
		    arr[i] = tempVar;
		}
		System.out.println("INVERSED ARRAY:");
		System.out.println(Arrays.toString(arr));
	
	}
}
