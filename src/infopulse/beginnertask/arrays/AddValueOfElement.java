//method for task Array65, Abramyan
package infopulse.beginnertask.arrays;

import java.util.Arrays;

public class AddValueOfElement {
	public static void addElement(int[] arr, int k) {
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = arr[i]+arr[k];}
	System.out.println("The A"+k+ " element has been added to all elements of the array.");	
	System.out.println(Arrays.toString(arr));
}
}