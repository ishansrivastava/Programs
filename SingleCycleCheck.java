import java.util.*;

class Program {
  public static boolean hasSingleCycle(int[] array) {
    // Write your code here.
		int STARTING_IDX=0,currentIdx=STARTING_IDX,visitedCount=0;
		
		while(visitedCount<array.length)
		{
			if(visitedCount>0 && currentIdx==0)
				return false;
			visitedCount++;
			currentIdx=getNextIdx(currentIdx,array);
		}
		return currentIdx==0;
  }
	
	public static int getNextIdx(int currentIdx,int []array)
	{
		int nextIdx=(currentIdx+array[currentIdx])%array.length;
		return (nextIdx>=0?nextIdx:array.length+nextIdx);
	}
}
