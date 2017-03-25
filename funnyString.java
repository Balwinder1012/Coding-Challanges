import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class funnyString {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            
            String s = sc.next();
            
            System.out.println(isFunny(s) ? "Funny" : "Not Funny");
            
            
            
            
        }
        
    
    sc.close();
    }
    
    
    public static boolean isFunny(String s){
        
        StringBuilder sb = new StringBuilder(s);
        
        StringBuilder rev = sb.reverse();
        String reverse = rev.toString();
        
        for(int i=1;i<s.length();i++)
        	
        	if(!(  Math.abs(s.charAt(i) - s.charAt(i-1)) == Math.abs(reverse.charAt(i) - reverse.charAt(i-1))          ))
        		return false;
        		
        	
        	
        	
        
        
        
        
        
        
        
        return true;
    }
    
}