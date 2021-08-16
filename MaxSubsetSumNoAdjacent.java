import java.util.*;

class Program {
  public static int maxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
    int adjacentMaxSum[]=new int[array.length];
		
		if(array.length==0)
			return 0;
		else if(array.length==1)
			return array[0];
		
		adjacentMaxSum[0]=array[0];
		adjacentMaxSum[1]=Math.max(adjacentMaxSum[0],array[1]);
		
		for(int i=2;i<array.length;i++)
		{
			adjacentMaxSum[i]=Math.max(adjacentMaxSum[i-1],array[i]+adjacentMaxSum[i-2]);
		}
		return adjacentMaxSum[array.length-1];
		
		
  }
}
