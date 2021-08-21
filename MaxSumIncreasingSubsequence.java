import java.util.*;

class Program {
  public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
    // Write your code here.
		List<Integer> sums=new ArrayList<Integer>();
		List<Integer> elements=new ArrayList<Integer>();
		int maxSumIdx=0;
		
		for(int i=0;i<array.length;i++)
			sums.add(array[i]);
		
		for(int i=0;i<array.length;i++)
			elements.add(Integer.MIN_VALUE);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[j]<array[i])
				{
					if(array[i]+sums.get(j)>sums.get(i))
					{
						sums.set(i,array[i]+sums.get(j));
						elements.set(i,j);
					}
				}
			}
			if(sums.get(i)>=sums.get(maxSumIdx))
				maxSumIdx=i;
		}
		
		ArrayList<Integer> maximumSum=new ArrayList<Integer>();
		maximumSum.add(sums.get(maxSumIdx));
		
		List<List<Integer>> results=new ArrayList<List<Integer>>();
		
		results.add(maximumSum);
		results.add(getSequences(array,elements,maxSumIdx));
		
		return results;
   
  }
	
	public static ArrayList<Integer> getSequences(int []array,List<Integer>elements,int maxSumIdx)
	{
		ArrayList<Integer> sequences=new ArrayList<Integer>();
		int i=maxSumIdx;
		sequences.add(array[maxSumIdx]);
		
		while(elements.get(i)!=Integer.MIN_VALUE)
		{
			sequences.add(array[elements.get(i)]);
			i=elements.get(i);
		}
		Collections.reverse(sequences);
		return sequences;
	}
}
