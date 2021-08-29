import java.util.*;

class Program {
  public static int kadanesAlgorithm(int[] array) {
    // Write your code here.
    int maxSoFar=array[0];
		int currentMaximum=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			currentMaximum=Math.max(currentMaximum+array[i],array[i]);
			maxSoFar=Math.max(maxSoFar,currentMaximum);
		}
		return maxSoFar;
  }
}
