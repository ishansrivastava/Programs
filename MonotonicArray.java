import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    // Write your code here.
		if(array.length<2)
			return true;
		int direction=array[1]-array[0];
		
		for(int i=2;i<array.length;i++)
		{
			if(direction==0)
			{
				direction=array[i]-array[i-1];
				continue;
			}
			if(breakDirection(direction,array[i-1],array[i]))
				return false;

		}
		return true;
    
  }
	
	public static boolean breakDirection(int direction,int previous,int current)
	{
		int difference=current-previous;
		if(direction>0)
			return difference<0;
		return difference>0;
	}
}
