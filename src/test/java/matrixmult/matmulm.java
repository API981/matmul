package matrixmult;

public class matmulm {

	int[][] mult(int[][] mat1,int[][] mat2) 
	{ 
		if(mat1[0].length!=mat2.length)
		{
			throw new RuntimeException("Matrix multiplication not possible");
		}
		else {
	int[][] res = new int[mat1.length][mat2[0].length]; 
	for(int i=0;i<mat1.length;i++) 
	{ 
	for(int j=0;j<mat2[0].length;j++) 
	{ 
		for (int k = 0; k < mat2.length; k++) 
			res[i][j]+=mat1[i][k]*mat2[k][j]; } 
	} 
	 return res;
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = { { 1, 1, 1 }, 
                { 2, 2, 2 }, 
                { 3, 3, 3 }, 
                { 4, 4, 4 } }; 

	  int B[][] = { { 1, 1, 1, 1 }, 
	                { 2, 2, 2, 2 }, 
	                { 3, 3, 3, 3 } }; 
	  
	  MatMulMain obj = new MatMulMain();
	  int res[][]=obj.mult(A, B);
	  for(int i=0;i<res.length;i++) 
		{ 
		for(int j=0;j<res[i].length;j++) 
		{ 
		System.out.print(res[i][j]+" "); 
		} 
		System.out.println(); 
		}
	}

}
