import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagram {

	
	public static void myMethod(){
		

        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        sc.close();
        sen = sen.toLowerCase();
        String s1[] = sen.split(" ");
        Set<Character> set = new HashSet<Character>();
        for(String s: s1){
        	
        	char[] ch = s.toCharArray();
        	
        	for(char c: ch)
        		set.add(new Character(c)); 
        	
        }
        
        System.out.println((set.size()==26) ? "pangram" : "not pangram" );
        
		
	}
	
	public static void theirsMethod(){
		Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        sc.close();
        sen = sen.toLowerCase();
        
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] letter = letters.toCharArray();
        boolean isPangram = true;
        for(char c: letter){
        	
        	if(!sen.contains(new Character(c).toString())){
        		isPangram = false;
        		break;
        		
        		
        	}
        	
        	
        }
		

        System.out.println(isPangram ? "pangram" : "not pangram" );
        
		
		
	}
    public static void main(String[] args) {

    	//myMethod();
    	theirsMethod();
    	
        
    }
}