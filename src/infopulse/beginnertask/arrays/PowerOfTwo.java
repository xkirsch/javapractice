//method for task array2, Abramyan
package infopulse.beginnertask.arrays;

public class PowerOfTwo {
	public static void powtwo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(2, (i + 1));
		}
		ArraysHelper.print(arr);
	
	}
}
