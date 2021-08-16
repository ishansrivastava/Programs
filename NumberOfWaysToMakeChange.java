import java.util.*;

class Program {
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    // Write your code here.
    int matrix[][]=new int[denoms.length][n+1];
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(j==0)
					matrix[i][j]=1;
				else if(i==0)
				{
					if(j>=denoms[i])
						matrix[i][j]=matrix[i][j-denoms[i]];
				}
				else
				{
					if(j>=denoms[i])
					{
						matrix[i][j]=matrix[i-1][j]+matrix[i][j-denoms[i]];
					}
					else
						matrix[i][j]=matrix[i-1][j];
				}
			}
		}
		return matrix[matrix.length-1][matrix[0].length-1];
  }
}
