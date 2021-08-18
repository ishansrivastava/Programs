import java.util.*;

class Program {
  public static int[] quickSort(int[] array) {
    // Write your code here.
    quickSort(array,0,array.length-1);
		return array;
  }
	
	public static void quickSort(int array[],int startIdx,int endIdx)
	{
		if(startIdx>=endIdx)
			return;
		int left=startIdx+1;
		int right=endIdx;
		int pivot=startIdx;
		while(left<=right)
		{
			if(array[left]>array[pivot] && array[right]<array[pivot])
				swap(left,right,array);
			else if(array[left]<=array[pivot])
				left++;
			else 
				right--;
		}
		swap(pivot,right,array);
		
		boolean leftSmallSubarray=((right-1)-startIdx<endIdx-(right+1)?true:false);
		
		if(leftSmallSubarray)
		{
			quickSort(array,startIdx,right-1);
			quickSort(array,right+1,endIdx);
		}
		else
		{
			quickSort(array,right+1,endIdx);
			quickSort(array,startIdx,right-1);
		}
		
	}
	
	public static void swap(int left,int right,int array[])
	{
		int tmp=array[left];
		array[left]=array[right];
		array[right]=tmp;
	}
	
}
