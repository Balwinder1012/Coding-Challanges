import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwinsArrays {

    static int patternCount(String s){
        char ch[] = s.toCharArray();
        int counter=0;
        boolean start = false;
        int i=0;
        int n=ch.length;
        while(i<n){
        	
        	//until 1 is encountered 
        	while(i<n && ch[i]!='1'){
        		i++;
        	}
        	
        	while(i<n && ch[i]=='1' && start == false){
        		
        		i++;
        	}
        	
        	start =  true;
        	
        	if(i<n && ch[i]!='0')
        		start = false;
        	
        	while(i<n && ch[i]=='0' && start==true)
        		i++;
        	
        	if(i<n && ch[i]=='1' && start == true)
        		counter++;
        	
        }
        
        
        
        
        
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }
}
