import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
    HashMap<Character,Integer>charactersMap=new HashMap<>();
		
		for(int i=0;i<characters.length();i++)
		{
			char c=characters.charAt(i);
			if(charactersMap.containsKey(c))
			{
				charactersMap.put(c,charactersMap.get(c)+1);
			}
			else
				charactersMap.put(c,1);
		}
		
		for(int i=0;i<document.length();i++)
		{
			char c=document.charAt(i);
			if(!charactersMap.containsKey(c) || charactersMap.get(c)==0)
				return false;
			charactersMap.put(c,charactersMap.get(c)-1);	
		}
		return true;
  }
}
