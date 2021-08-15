import java.util.*;

class Program {
  public static AncestralTree getYoungestCommonAncestor(
      AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
    // Write your code here.
     int depthOne=depthDescendant(descendantOne,topAncestor);
		 int depthTwo=depthDescendant(descendantTwo,topAncestor);
		if(depthOne>depthTwo)
		{
			return findCommonAncestor(descendantOne,descendantTwo,depthOne-depthTwo);
		}
		else
		{
			return findCommonAncestor(descendantTwo,descendantOne,depthTwo-depthOne);
		}
  }
	
	public static AncestralTree findCommonAncestor(AncestralTree lowerDescendent,AncestralTree higherDescendent,int diff)
	{
		while(diff>0)
		{
			lowerDescendent=lowerDescendent.ancestor;
			diff--;
		}
		while(lowerDescendent!=higherDescendent)
		{
			lowerDescendent=lowerDescendent.ancestor;
			higherDescendent=higherDescendent.ancestor;
		}
		return lowerDescendent;
	}
	
	public static int depthDescendant(AncestralTree descendant,AncestralTree topAncestor)
	{
		int depth=0;
		while(descendant!=topAncestor)
		{
			depth++;
			descendant=descendant.ancestor;
		}
			
		return depth;
	}

  static class AncestralTree {
    public char name;
    public AncestralTree ancestor;

    AncestralTree(char name) {
      this.name = name;
      this.ancestor = null;
    }

    // This method is for testing only.
    void addAsAncestor(AncestralTree[] descendants) {
      for (AncestralTree descendant : descendants) {
        descendant.ancestor = this;
      }
    }
  }
}
