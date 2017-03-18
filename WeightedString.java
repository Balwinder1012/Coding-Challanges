import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedString {

    public static HashSet<Integer> hset;
    
    
    public static void findSubstring(String s){
        hset =  new HashSet<Integer>();
        int alphaNum='a';
        int lastNum=1;
        int top=0;
        
        for(char c: s.toCharArray()){
        	int val = c - alphaNum + 1;
        	
        	if(val==lastNum)		
        		top++;
        
        	else
        		top=1;
    
            
        	hset.add(top*val);
        	lastNum=val;
        	
        }
 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        findSubstring(s);
        int n = in.nextInt();
        
        for(int a0 = 0; a0 < n; a0++){
  
           int x = in.nextInt();
            
            System.out.println(hset.contains(x) ? "Yes" : "No");
            
         
       }
    }
}
