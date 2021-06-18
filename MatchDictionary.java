import java.util.HashMap;
import java.util.Map;

public class MatchDictionary {
    public class TrieNode {
        
    	Map<Character,TrieNode>children;
    	boolean endOfWord;
    	public TrieNode()
    	{
    		children=new HashMap<>();
    		endOfWord=false;
    	}
    }
    
    private TrieNode root;
    public MatchDictionary() {
    	root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();++i)
        {
        	char ch=word.charAt(i);
        	TrieNode node=current.children.get(ch);
        	if(node==null)
        	{
        		node=new TrieNode();
        		current.children.put(ch,node);
        	}
        	current=node;
        }
        current.endOfWord=true;
    }

    public boolean search(String word) {
    	TrieNode current=root;
    	for(int i=0;i<word.length();++i)
    	{
    		char ch=word.charAt(i);
    		TrieNode node=current.children.get(ch);
    		if(node==null)
    		{
    			return false;
    		}
    		current=node;
    	}
    	return current.endOfWord;
    }
}
    
 