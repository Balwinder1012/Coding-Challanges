import java.util.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfAnagrams {


	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
       
        String ans="YES";
        char chars[] = new char[26];

    	for(char ch: s.toCharArray())
    		chars[ch-'a']++;
    	
       if(s.length()%2==0){
        	
        	for(char ch: chars)
        		if(ch%2!=0){
        			ans="NO";
        			break;
        		}
        	
        	
        	
        	
        	
        }
        
       else{
    	   
    	   int counter=0;
    	   
    	   for(char ch: chars){
    		if(counter==0){
    			
    			if(ch%2!=0){
    				counter=1;
    				ans="YES";
    			}
    		}
    		else{
    			if(ch%2!=0){
    				
    				ans="YES";
    				break;
    				}
    	   
    		}
    	   
       }
        
        
       } 
        System.out.println(ans);
        myScan.close();
    }
       
}
