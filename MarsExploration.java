import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  String S = in.next();
        String S = "SOSSPSSQSSOR";
        int counter=0;
        
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<S.length()/3;i++){
            sb.append("SOS");
            
        }
        
        
        
        String O = sb.toString();
        char ch[] = O.toCharArray();
        for(char c:ch){
            System.out.print(c);
        }
        System.out.println();
        for(int i=0;i<ch.length;i++){
            
            if(ch[i] != S.charAt(i))
            counter++;
            
        }
        
        
        
        System.out.println(counter);
        
    }
}
