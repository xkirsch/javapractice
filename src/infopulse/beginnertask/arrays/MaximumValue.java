//method for task Array53, Abramyan
package infopulse.beginnertask.arrays;

import java.util.Arrays;

public class MaximumValue {
	public static void findMaxValue(int[] arr, int[] arr1,  int n) {
	int[] finalArr = new int[n];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] < arr1[i]) {
			finalArr[i]=arr1[i];
		} else {
			 finalArr[i]=arr[i];
		}
	}
	System.out.println("ARRAY OF MAXIMUM VALUES");
	System.out.println(Arrays.toString(finalArr));
}
}