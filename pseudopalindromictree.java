import java.io.*;
import java.util.*;
/*public class pseudopalindromictree {
	int count;
public int pseudoPalindromicPaths (TreeNode root) {
        
        rootToLeafNodes(root,0);
        return count;
    }
    

public void findPalindrome(int n)
{
    HashMap<Character,Integer>map=new HashMap<Character,Integer>();
    ArrayList<Character>c=new ArrayList<Character>();
    String s=(String.valueOf(n));
    if(s.length()==2)
    {
        if(s.charAt(0)==s.charAt(1))
            ++count;
    }
    else
    {
        for(int i=0;i<s.length();++i)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
            {
                map.put(ch,1);
                c.add(ch);
            }
                
        }
        boolean hasOdd=false;int flag=1;
        for(int i=0;i<c.size();++i)
        {
            if(map.get(c.get(i))%2==1)
            {
                if(hasOdd)
                    flag=0;
                else
                    hasOdd=true;
            }
                
        }
        
        if(flag==1)
            ++count;
    }
}

    public void rootToLeafNodes(TreeNode root,int s)
    {
        if(root.left==null && root.right==null)
        {
            s=s*10+root.val;
            //System.out.println(s);
            findPalindrome(s);
            return;
        }
        
        else if(root.left==null && root.right!=null)
        {
            s=s*10+root.val;
            rootToLeafNodes(root.right,s);
        }
        
        else if(root.left!=null && root.right==null)
        {
            s=s*10+root.val;
            rootToLeafNodes(root.left,s);
        }
        
        else
        {
            s=s*10+root.val;
            rootToLeafNodes(root.left,s);
            rootToLeafNodes(root.right,s);
        }
    }
	public static void main(String args[])
	{
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(1);
		root.right=new TreeNode(1);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		root.left.right.right=new TreeNode(1);
		//root.right.right=new TreeNode(1);
		pseudopalindromictree obj=new pseudopalindromictree();
		int ans=obj.pseudoPalindromicPaths(root);
		System.out.println(ans);
	}
}*/
	
	class pseudopalindromictree {
	    int result = 0;
	    public int pseudoPalindromicPaths (TreeNode root) {
	        int[] map = new int[10];
	        findPesudoPalindromUtil(root,map);
	        return result;
	    }
	    
	    void findPesudoPalindromUtil(TreeNode root,int[] map){
	       
	        if(root == null){
	            return;
	        }
	         map[root.val] = map[root.val]+1;
	         if(root.left == null && root.right == null){
	             if(isPalindrome(map))
	                result++;
	        }
	       
	        findPesudoPalindromUtil(root.left,map);
	        findPesudoPalindromUtil(root.right,map);
	        //backtrack
	       //map[root.val] = map[root.val]-1;
	       
	        
	    }
	    boolean isPalindrome(int[] map){
	        int miss = 0;
	        for(int i=0;i<=9;i++){
	            if(map[i] % 2 != 0)
	                miss++;
	            if(miss > 1)
	                return false;
	        }
	        return true;
	    }
	    public static void main(String args[])
		{
			TreeNode root=new TreeNode(2);
			root.left=new TreeNode(1);
			root.right=new TreeNode(1);
			root.left.left=new TreeNode(1);
			root.left.right=new TreeNode(3);
			root.left.right.right=new TreeNode(1);
			//root.right.right=new TreeNode(1);
			pseudopalindromictree obj=new pseudopalindromictree();
			int ans=obj.pseudoPalindromicPaths(root);
			System.out.println(ans);
		}
	}
