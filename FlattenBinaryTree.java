import java.util.*;

class Program {
  public static BinaryTree flattenBinaryTree(BinaryTree root) {
    // Write your code here.
    return flattenTree(root)[0];
  }
	
	public static BinaryTree[] flattenTree(BinaryTree node)
	{
		BinaryTree leftMost;
		BinaryTree rightMost;
		
		if(node.left==null)
			leftMost=node;
		else
		{
			BinaryTree[] leftAndRightMostNodes=flattenTree(node.left);
			connectNodes(leftAndRightMostNodes[1],node);
			leftMost=leftAndRightMostNodes[0];
		}
		
		if(node.right==null)
			rightMost=node;
		else
		{
			BinaryTree[] leftAndRightMostNodes=flattenTree(node.right);
			connectNodes(node,leftAndRightMostNodes[0]);
			rightMost=leftAndRightMostNodes[1];
		}
			
		return new BinaryTree[]{leftMost,rightMost};
	}
	
	public static void connectNodes(BinaryTree one,BinaryTree two)
	{
		one.right=two;
		two.left=one;
	}

  // This is the class of the input root. Do not edit it.
  static class BinaryTree {
    int value;
    BinaryTree left = null;
    BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
	
	
}
