import java.util.*;

class Program {
  public static int[] subarraySort(int[] array) {
    // Write your code here.
    int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		int startIndex=0,endIndex=0,left=0,right=1,flag=0;
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				max=array[i];
				endIndex=i+1;
				min=Math.min(min,array[i+1]);
				flag=1;
			}
			else if(array[i]<=array[i+1] && array[i+1]<max)
			{
				endIndex=i+1;
				min=Math.min(min,array[i]);
			}
			else continue;
		}
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>min)
			{
				startIndex=i;
				break;
			}
		}
		
		if(flag==0)
			return new int[]{-1,-1};
		else
			return new int[]{startIndex,endIndex};
		
  }
}
