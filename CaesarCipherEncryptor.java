import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
		String newStr="";
		
    for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if((int)c+(key%26)<122)
				newStr+=(char)(c+(key%26));
			else if((int)c+(key%26)>122)
			{
				if((int)c==122)
					newStr+=(char)('a'+(key-1));
				else
				{
					int k=122-(int)c;
					k=key-k;
					newStr+=(char)('a'+(k-1));					
				}

			}
			else
				newStr+='z';
		}
		
		return newStr;
  }
}
