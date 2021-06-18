//https://java2blog.com/depth-first-search-in-java/
import java.io.*;
import java.util.*;
public class DFS {
	
	static class Node{
		int data;
		boolean visited;
		List<Node>neighbours;
		
		Node(int data)
		{
			this.data=data;
			this.neighbours=new ArrayList<>();
		}
		
		public void addNeighbours(Node neighbourNode)
		{
			this.neighbours.add(neighbourNode);
		}
		
		public List<Node> getNeighbours()
		{	
			return neighbours;
		}
		
		public void setNeighbour(List<Node>neighbours)
		{
			this.neighbours=neighbours;
		}
		
	}
	
	public void depthFirstSearch(Node node)
	{
		Stack<Node>stack=new Stack<Node>();
		stack.add(node);
		
		while(!stack.isEmpty())
		{
			Node element=stack.pop();
			if(!element.visited)
			{
				System.out.print(element.data+" ");
				element.visited=true;
			}
			
			List<Node>neighbours=element.getNeighbours();
			for(int i=0;i<neighbours.size();++i)
			{
				Node n=neighbours.get(i);
				if(n!=null && !n.visited)
				{
					stack.add(n);
				}
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addNeighbours(node20);
		node40.addNeighbours(node10);
		node10.addNeighbours(node30);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);
		
		DFS dfs=new DFS();
		dfs.depthFirstSearch(node40);
	}
	
}
