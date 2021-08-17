import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
    int result[]={Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
	
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>result[2])
			{
				result[0]=result[1];
				result[1]=result[2];
				result[2]=array[i];
			}
			else if(array[i]>result[1])
			{
				result[0]=result[1];
				result[1]=array[i];
			}
			else if(array[i]>result[0])
			{
				result[0]=array[i];
			}
		}
		return result;
		
  }
}
