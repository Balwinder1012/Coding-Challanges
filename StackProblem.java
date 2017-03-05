import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackProblem {
    
    public static boolean isBalanced(String expression) {
        
        char[] bracks = expression.toCharArray();
        Stack<Character> s = new Stack<Character>();
        
        
        if(bracks.length %2 != 0) return false;
        else{
        for(char c:  bracks){
            
            switch(c){
                
                case  '(' : s.push(')'); break;
                case  '{' : s.push('}'); break;
                case  '[' : s.push(']'); break;
                
                default:
                
                if(s.isEmpty() || c!=s.peek()) 
                	return false;
                
                s.pop();
                
                
                
            }
            
            
        }
        }
        return true;
        
        
        
        
        
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        String expression[] = new String[t];
        
        for (int a0 = 0; a0 < t; a0++) {
            expression[a0] = in.next();
            
    
        }
        
        for(String s: expression)
       System.out.println( (isBalanced(s)) ? "YES" : "NO" );
    }
    
}
