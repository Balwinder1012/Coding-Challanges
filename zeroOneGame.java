import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class zeroOneGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        
        for(int a0 = 0; a0 < g; a0++){
        	int counter=1;
            boolean alice = false;
            boolean bob = true;
        	int n = in.nextInt();
            int[] sequence = new int[n];
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }

            LinkedList<Integer> ls = new LinkedList<Integer>();
            for(int num:sequence)
             ls.add(new Integer(num));
            
            if(elementExist(ls)==-1 || n<2)
            	System.out.println("Bob");
            else{
            	
            	while(ls.size()>2){
            		int index = elementExist(ls);
            		if(index!=-1){
            		ls.remove(index);
            		
            		if(counter%2!=0){
            			
            			alice = true;
            			bob = false;
            		}
            		else{
            			
            			alice = false;
            			bob = true;
            		}
            		
            		counter++;
            		}
            		else
            			break;
            		
            	}
            	
            	System.out.println(alice == true ? "Alice" : "Bob");
            	
            }
        
        }
    }
    public static int elementExist(LinkedList<Integer> ls){
    	
    	Integer a[] = ls.toArray(new Integer[ls.size()]);
    	
    	for(int i=0;i<a.length-2;i++){
    		
    		if(a[i]==0 && a[i+2]==0)
    			return i+1;
    		
    		
    	}
    	
    	return -1;
    	
    	
    	
    	
    }
}
