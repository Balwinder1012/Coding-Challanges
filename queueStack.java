import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queueStack{
    
    public static void main(String[] args) {
     
    	LinkedList<Integer> ls =new LinkedList<Integer>();
    	
    	ls.add(34);
    	ls.add(31);
    	ls.add(36);
    	ls.add(12);
    	ls.add(12);
    	
    	Integer[] arr = ls.toArray(new Integer[ls.size()]);
    	
    	
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	hs.addAll(ls);
    	StringBuilder[] sd = new StringBuilder[4];
   
    	Integer[] harr = hs.toArray(new Integer[hs.size()]);
    	for(int i=0;i<arr.length;i++)
    	System.out.println(arr[i]);
    	
    	for(int i=0;i<hs.size();i++)
    		System.out.print(" "+harr[i] );
    	
      
    }
}
