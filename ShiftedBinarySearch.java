import java.util.*;

class Program {
  public static int shiftedBinarySearch(int[] array, int target) {
    // Write your code here.
		
		int low=0,high=array.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==target)
				return mid;
			else if(array[low]<=array[mid])
			{
				if(target<array[mid] && target>=array[low])
					high=mid-1;
				else
					low=mid+1;
			}
			else
			{
				if(target>array[mid] && target<=array[high])
					low=mid+1;
				else
					high=mid-1;
			}
			
		}
    return -1;
  }
}
