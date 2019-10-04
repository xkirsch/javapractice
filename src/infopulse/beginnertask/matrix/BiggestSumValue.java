//Matrix25
package infopulse.beginnertask.matrix;

public class BiggestSumValue {

	public static void main(String[] args) {

		int[][] matrixA = { { 2, 5, 14, 3, 5 }, { 4, 3, 4, 6, 12 }, { 5, 7, 7, 3, 5 }, { 6, 7, 16, 6, 7 },
				{ 10, 4, 1, 11, 2 } };
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[] arr = new int[matrixA.length];
		
		for (int i = 0; i < matrixA.length; i++) {
			int sumline = 0;
			for (int j = 0; j < matrixA[i].length; j++) {
				sumline = sumline + matrixA[i][j];
				arr[i] = sumline;
			}
		}
		
		
		int max = arr[0];
		int indexmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				indexmax = i;
			}
		}
		
		
		System.out.println("\n" + "Value of the biggest sum is " + max + " in the line " + (indexmax + 1) + ".");
	}
}