// 05.10.2019 Java lesson
package infopulse.beginnertask.matrix;

public class MatrixExample {

	public static void main(String[] args) {
		//
		int[][] matrixA = { { 1, 2, 3, 4, 54 }, { 4, 5, 5, 3, 5 ,5}, { 5, 3, 4 } };
		System.out.println(matrixA.length);
		System.out.println(matrixA[0].length);
		
		MatrixLib.print(matrixA);
		int maxLength = MatrixLib.getMaxLengthRow(matrixA);
		System.out.println(maxLength);
	}
			

	
	}


