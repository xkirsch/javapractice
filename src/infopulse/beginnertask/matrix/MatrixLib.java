package infopulse.beginnertask.matrix;

public class MatrixLib {
	public static int getMaxLengthRow(int[][] matrixA) {
		int maxLength = matrixA[0].length;
		for (int i = 0; i < matrixA.length; i++) {
			if (maxLength < matrixA[i].length)
				maxLength = matrixA[i].length;

		}
		return maxLength;
	}

	public static void print(int[][] matrixA) {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] getTraspMatrix(int[][] matrix, int maxLength) {
		int[][] traspMatrix = new int[maxLength][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				traspMatrix[j][i] = matrix[i][j];

			}
		}
		return traspMatrix;
	}
}