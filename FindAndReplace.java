import java.io.*;
import java.util.*;
public class FindAndReplace {

	public static void main(String args[])
	{
		String originalString="",word="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of words to be replaced");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the original String");
		while(!((word=sc.nextLine()).compareTo("END")==0))
		originalString+=word;
		String findWords[]=new String[n];
		String replaceWords[]=new String[n]; 
		System.out.println("Enter the find words");
		for(int i=0;i<n;i++)
		{
			findWords[i]=sc.nextLine();
		}
		
	
		System.out.println("Enter the replace words");
		for(int i=0;i<n;i++)
		{
			replaceWords[i]=sc.nextLine();
		}
		for(int i=0;i<findWords.length;++i)
		{
			 originalString=originalString.replaceAll(findWords[i],replaceWords[i]);
		}
		System.out.println(originalString);
	}
}
