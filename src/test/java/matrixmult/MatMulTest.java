package matrixmult;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.java.matrixmult.MatMulMain;
public class MatMulTest {
	
	public static MatMulMain obj;
	@BeforeAll
	public static void CreateObj()
	{
		obj=new MatMulMain();
	}
	int A[][] = { { 1, 1, 1 }, 
            { 2, 2, 2 }, 
            { 3, 3, 3 }, 
            { 4, 4, 4 } }; 

	int B[][] = { { 1, 1, 1, 1 }, 
                { 2, 2, 2, 2 }, 
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 }}; 
	@Test
	public void testrowcol()
	{
		try{
			obj.mult(A, B);
		}
		catch (Exception e) {
			// TODO: handle exception
			Assertions.assertEquals("Matrix multiplication not possible", e.getMessage());
		}
	}
	int C[][]= { { 1, 1, 1, 1 }, 
            { 2, 2, 2, 2 }, 
            { 3, 3, 3, 3 }}; 
	
	int res[][]= {{6,6,6,6}, 
			{12,12,12,12},
			{18,18,18,18}, 
			{24,24,24,24}};
	@Test
	public void testvalid()
	{
		Assertions.assertArrayEquals(res, obj.mult(A, C));
	}
	
/*	@Test
	public void testinvalid()
	{
		res[0][3]=8;
		Assertions.assertArrayEquals(res, obj.mult(A, C));
	}*/
}
