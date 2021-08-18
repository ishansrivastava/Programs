import java.util.*;

class Program {
  public static int[] searchForRange(int[] array, int target) {
    // Write your code here.
    int lower=lowerBound(array,target);
		int higher=upperBound(array,target);
		return new int[]{lower,higher};
  }
	
	public static int lowerBound(int []array,int target)
	{
		int low=0,high=array.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]>target)
				high=mid-1;
			else if(array[mid]<target)
				low=mid+1;
			else
			{
				if(mid==0 || array[mid-1]!=target)
					return mid;
				else
					high=mid-1;
			}
		}
		return -1;
	}
	
	public static int upperBound(int []array,int target)
	{
		int low=0,high=array.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]>target)
				high=mid-1;
			else if(array[mid]<target)
				low=mid+1;
			else
			{
				if(mid==array.length-1 || array[mid+1]!=target)
					return mid;
				else
					low=mid+1;
			}
	}
		return -1;
}
}