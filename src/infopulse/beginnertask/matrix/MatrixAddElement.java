//Matrix1
package infopulse.beginnertask.matrix;

public class MatrixAddElement {

	public static void main(String[] args) {

		int I=3;
		int [][]  matrixA = {
				{2,5,14,3,5},
				{4,1,4,6,12},
				{5,32,1,3,5},
				{6,1,16,6,7},
				{10,4,1,11,2}};		
		
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 5; j++) {
	    	if (i==(I-1)) {matrixA[i][j] = 10*I;}
	        System.out.print(matrixA[i][j] +" ");
	    }
	    System.out.println();
	}
}
}