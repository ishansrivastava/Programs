import java.util.*;

class Program {
	
	
	
  public static List<Integer> riverSizes(int[][] matrix) {
    // Write your code here.
    boolean visited[][]=new boolean[matrix.length][matrix[0].length];
		List<Integer>sizes=new ArrayList<Integer>();
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(visited[i][j]==true)
					continue;
				traverseMatrix(matrix,i,j,visited,sizes);
			}
		}
		return sizes;
  }
	
	public static void traverseMatrix(int matrix[][],int i,int j,boolean visited[][],List<Integer>sizes)
	{
		int currentRiverSizes=0;
		
		Stack<Integer[]>stack=new Stack<Integer[]>();
		
		stack.push(new Integer[]{i,j});
		while(!stack.isEmpty())
		{
			Integer[]currentNode=stack.pop();
			i=currentNode[0];
			j=currentNode[1];
			if(visited[i][j])
				continue;
			if(matrix[i][j]==0)
				continue;
			visited[i][j]=true;
			currentRiverSizes++;
			List<Integer[]> unvisitedNeighbours=getUnvisitedNeighbours(matrix,visited,i,j);
			for(Integer[] neighbor:unvisitedNeighbours)
				stack.push(neighbor);
		}
		if(currentRiverSizes>0)
			sizes.add(currentRiverSizes);
	}
	
	public static List<Integer[]> getUnvisitedNeighbours(int matrix[][],boolean visited[][],int i,int j)
	{
		List<Integer[]>neighbours=new ArrayList<Integer[]>();
		
		if(i>0 && !visited[i-1][j])
			neighbours.add(new Integer[]{i-1,j});
		if(i<matrix.length-1 && !visited[i+1][j])
			neighbours.add(new Integer[]{i+1,j});
		if(j>0 && !visited[i][j-1])
			neighbours.add(new Integer[]{i,j-1});
		if(j<matrix[0].length-1 && !visited[i][j+1])
			neighbours.add(new Integer[]{i,j+1});
		return neighbours;
	}
	
}
