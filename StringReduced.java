import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringReduced {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        sc.close();
       
        
        for(int i=1;i<s.length();i++){
            
            
            if(s.charAt(i) == s.charAt(i-1)){
                
                s = s.substring(0,i-1) + s.substring(i+1);
                i=0;
            }
            
            
            
            
        }
     
       System.out.println(s.length()==0 ? "Empty String" : s); 	
        	
     
        
        
    }
}