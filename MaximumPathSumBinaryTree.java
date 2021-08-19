import java.util.*;

class Program {
  public static int maxPathSum(BinaryTree tree) {
    // Write your code here.
		
		return maxSum(tree).currentMaxSum;
    
  }
	
	public static TreeInfo maxSum(BinaryTree tree)
	{
		if(tree==null)
			return new TreeInfo(0,Integer.MIN_VALUE);
		
		TreeInfo leftBranchSum=maxSum(tree.left);
		TreeInfo rightBranchSum=maxSum(tree.right);
		
		int maxChildBranchSum=Math.max(leftBranchSum.branchSum,rightBranchSum.branchSum);
		int maxBranchSum=Math.max(maxChildBranchSum+tree.value,tree.value);
		int maxSumWithParentNode=Math.max(maxBranchSum,leftBranchSum.branchSum+tree.value+rightBranchSum.branchSum);
		int finalMaxSum=Math.max(Math.max(leftBranchSum.currentMaxSum,rightBranchSum.currentMaxSum),maxSumWithParentNode);
		return new TreeInfo(maxBranchSum,finalMaxSum);
	}

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
	
	static class TreeInfo{
		public int branchSum;
		public int currentMaxSum;
		
		public TreeInfo(int branchSum,int currentMaxSum)
		{
			this.branchSum=branchSum;
			this.currentMaxSum=currentMaxSum;
		}
	}
}
