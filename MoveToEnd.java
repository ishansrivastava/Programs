import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    // Write your code here.
    int left=0,right=array.size()-1;
		while(left<right)
		{
			if(array.get(right)==toMove)
				right--;
			else
			{
				if(array.get(left)==toMove)
				{
					int tmp=array.get(left);
					array.set(left,array.get(right));
					array.set(right,tmp);
					left++;
					right--;
				}
				else
					left++;
			}
		}
		return array;
  }
}

https://github.com/ishansrivastava/Programs.git