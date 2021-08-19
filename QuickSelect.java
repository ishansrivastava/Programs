import java.util.*;

class Program {
	
  public static int quickselect(int[] array, int k) {
    // Write your code here.
		k=k-1;
    return quickSort(array,0,array.length-1,k);
  }
	
	public static int quickSort(int []array,int startIdx,int endIdx,int k)
	{
		while(true)
		{
			int left=startIdx+1;
			int right=endIdx;
			int pivot=startIdx;
			
			
			while(left<=right)
			{
				if(array[left]>array[pivot] && array[right]<array[pivot])
					swap(left,right,array);
				if(array[left]<=array[pivot])
					left++;
				if(array[right]>=array[pivot])
					right--;
			}
			
			swap(pivot,right,array);
			
			if(right==k)
			{
				return array[right];
			}
				
			else if(right<k)
				startIdx=right+1;
			else
				endIdx=right-1;
			
		}
	}
	
	public static void swap(int left,int right,int array[])
	{
		int tmp=array[left];
		array[left]=array[right];
		array[right]=tmp;
	}
}
