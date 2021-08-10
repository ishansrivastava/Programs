import java.util.*;

class Program {
  public static int[] largestRange(int[] array) {
    // Write your code here.
    Arrays.sort(array);
		int max=Integer.MIN_VALUE;
		int start=array[0],end=array[0],range=0,finalStart=0,finalEnd=0;
		for(int j=0;j<array.length;j++)
		System.out.print(array[j]+", ");
		if(array.length==1)
			return new int[]{array[0],array[0]};
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i+1]==array[i]+1 || array[i+1]==array[i])
			{
				end=array[i+1];
			}
			else
			{
				range=(end-start)+1;
				if(range>max)
				{
					max=(end-start)+1;
					finalStart=start;
					finalEnd=end;
					start=array[i+1];
					end=array[i+1];
				}
			}
		}
		range=(end-start)+1;
		if(range>max)
		{
				max=(end-start)+1;
				finalStart=start;
				finalEnd=end;
		}
		return new int[]{finalStart,finalEnd};
  }
}
