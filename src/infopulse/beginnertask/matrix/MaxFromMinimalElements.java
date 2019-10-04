//Matrix27
package infopulse.beginnertask.matrix;

import java.util.Arrays;

public class MaxFromMinimalElements {

	public static void main(String[] args) {

		int[][] matrixA = { { 2, 5, 14, 3, 5 }, { 4, 1, 4, 6, 12 }, { 5, 32, 4, 13, 5 }, { 6, 1, 16, 6, 7 },
				{ 10, 4, 3, 11, 4 } };

		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		int[] arr = new int[matrixA.length];
		for (int i = 0; i < matrixA.length; i++) {

			int min = Integer.MAX_VALUE;
			for (int j = 0; j < matrixA[i].length; j++) {

				if (min > matrixA[i][j]) {
					min = matrixA[i][j];
					arr[i] = min;
				}
			}
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
	}
		}
		System.out.println("Maximum from the list of minimal elements "+Arrays.toString(arr)+" is "+max+".");
}
}