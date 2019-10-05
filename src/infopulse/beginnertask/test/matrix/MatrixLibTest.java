package infopulse.beginnertask.test.matrix;

import org.junit.Assert;

import org.junit.Test;

import infopulse.beginnertask.matrix.MatrixLib;


public class MatrixLibTest {

	@Test
	public void testGetMaxLengthRow_PositiveValueMatrix2rowNotEqualsLength_Correct() {
		int [][]matrix = {{1,2,3},{5,6}};
		int expRes = 2;
		
		int actRes = MatrixLib.getMaxLengthRow(matrix);
		Assert.assertEquals(expRes,actRes);
	}
	@Test
	public void testGetMaxLengthRow_PositiveValueMatrix2rowEqualsLength_Correct() {
		int [][]matrix = {{1,2},{5,6}};
		int expRes = 2;
		
		int actRes = MatrixLib.getMaxLengthRow(matrix);
		Assert.assertEquals(expRes,actRes);
	}
}
