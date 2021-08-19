import java.util.*;

class Program {
  public int indexEqualsValue(int[] array) {
    // Write your code here.
    int low=0,high=array.length-1,ans=Integer.MAX_VALUE;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(array[mid]==mid)
			{
				ans=Math.min(ans,mid);
				high=mid-1;
			}
				
			else if(array[mid]<mid)
				low=mid+1;
			else
				high=mid-1;
		}
		if(ans==Integer.MAX_VALUE)
			return -1;
		else 
			return ans;
  }
}
