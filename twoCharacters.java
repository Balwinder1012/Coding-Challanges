import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class twoCharacters {

	public static int make_string(String str, char a, char b)
	{
	    int len = str.length();
	    String temp = "";
	    
	    char[] ch = str.toCharArray();
	    char last;

	    for(int i=0; i<len; i++)
	    {
	        if(ch[i]== a || ch[i] == b)
	            temp+=ch[i];
	    }

	    len = temp.length();
	    if(len <= 1)
	        return 0;

	    last = temp.charAt(0);
	    for(int i=1; i<len; i++)
	    {
	        if(temp.charAt(i) == last)
	            return 0;
	        last = temp.charAt(i);
	    }
	    return len;
	}		
	

	public static void main(){
		
		
		
		Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        StringBuilder sb = new StringBuilder();
        
        char[] ch = s.toCharArray();
        int largest=0;
        Set<Character> st = new HashSet<Character>();
        
       
        for(int i=0;i<ch.length;i++){
        	st.add(new Character(ch[i]));
	
        }
  
        Character[] cc = (Character[]) st.toArray();
        
        for(int i=0;i<s.length();i++){
        	
        	  //Set<Character> st1 = new HashSet<Character>();
        	  //st1.addAll(st);
        	  
        	  
        	
        	
        	
        	
        	
        }
        
        
		
		
		
	}
	}
