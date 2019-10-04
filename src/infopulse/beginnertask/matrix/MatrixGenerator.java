package infopulse.beginnertask.matrix;

import java.util.Scanner;

public class MatrixGenerator {
	public static void generate(int m, int n) {
		int[][] matrixA;
		matrixA = new int[m][n];
		for (int i = 0; i < m; i++) {
		    for (int j = 0; j < n; j++) {
		    	matrixA[i][j] = (int) (Math.random() *100);	
		        System.out.print(matrixA[i][j] +" ");
		    }
		    System.out.println();
		}
	}
public static void main(String[] args) {
Scanner newNumber = new Scanner(System.in);
System.out.println("Enter number");
int m = newNumber.nextInt();
System.out.println("Enter number");
int n = newNumber.nextInt();
generate(m,n);
}
}