import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MedianFind {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        ArrayList<Integer> elem = new ArrayList<Integer>();
        
        for(int num: a){
            
            int a1 = 0;
            int a2 = 0;
            elem.add(num);
            
            Collections.sort(elem);
            int l = elem.size();
            if(l% 2!=0)
                {
                    Double t = (double) 0;
                    t=l*(.5);
                   int ind = (int)Math.ceil(t); 
                   
                   float med = elem.get(ind-1);
                    System.out.printf("%.1f\n",med );
                    
                
            }
            else{
            	
            	a1 = l/2;
            	a2 = a1+1;
            	
            	int elem1 = elem.get(a1-1);
            	int elem2 = elem.get(a2-1);
            	
            	 Double med = (elem1+elem2)*(.5);
            	 System.out.printf("%.1f\n",med );
            	
            	
            	
            	
            	
            }
            
            
            
            
            
            
            
        }
        
    }
}
