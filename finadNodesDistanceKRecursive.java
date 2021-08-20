import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
    // Write your code here.
    ArrayList<Integer>result=new ArrayList<>();
		
		int ans=nodesAtDistanceK(tree,target,k,result);
		return result;
  }
	
	public int nodesAtDistanceK(BinaryTree tree,int target,int k,ArrayList<Integer>result)
	{
		if(tree==null)
			return -1;
		if(tree.value==target)
		{
			nodesAtDistanceKFromTarget(tree,0,k,result);
			return 1;
		}
		
		int leftDistance=nodesAtDistanceK(tree.left,target,k,result);
		int rightDistance=nodesAtDistanceK(tree.right,target,k,result);
		
		if(leftDistance==k || rightDistance==k)
			result.add(tree.value);
		
		if(leftDistance!=-1)
		{
			nodesAtDistanceKFromTarget(tree.right,leftDistance+1,k,result);
			return leftDistance+1;
		}
		if(rightDistance!=-1)
		{
			nodesAtDistanceKFromTarget(tree.left,rightDistance+1,k,result);
			return rightDistance+1;
		}
		
		return -1;
	}
	
	public void nodesAtDistanceKFromTarget(BinaryTree tree,int distance,int k,ArrayList<Integer>result)
	{
		if(tree==null)
			return ;
		
		if(distance==k)
			result.add(tree.value);
		
		nodesAtDistanceKFromTarget(tree.left,distance+1,k,result);
		nodesAtDistanceKFromTarget(tree.right,distance+1,k,result);	
	}
	
}
