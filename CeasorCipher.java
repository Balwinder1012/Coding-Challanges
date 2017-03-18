import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeasorCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        k=k%26;
     //   char[] ch = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            
        	int ascii = (int)s.charAt(i);
            if(s.charAt(i) >= 65 && s.charAt(i)<=90){
                
                ascii += k;
                
                if(ascii > 90)
                	ascii = ascii - 26;
                
            }
            
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
            	
            	ascii += k;
                
                if(ascii > 122)
                	ascii = ascii - 26;
            }
           sb.append((char)ascii);
         //   sb.append(new String(   new Character((char)ascii)  .toString()      ));
        }
        
        
        System.out.println(sb);
        
        
    }
}
