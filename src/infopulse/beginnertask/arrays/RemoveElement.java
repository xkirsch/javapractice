//method for task Array90, Abramyan
package infopulse.beginnertask.arrays;

import java.util.Arrays;

public class RemoveElement {
	public static void remove (int[] arr, int k) {
		int[] newArray = new int[arr.length - 1];
		System.arraycopy(arr, 0, newArray, 0, k );
	    System.arraycopy(arr, k+1, newArray, k, arr.length - k-1);
		System.out.println(Arrays.toString(newArray));
}

}