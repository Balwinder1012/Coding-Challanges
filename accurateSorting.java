import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class accurateSorting {

	public static void insertSort(int[] a){
		
		for(int i=1;i<a.length;i++){
			
			int key = a[i];
			int j=i-1;
			while(j>=0 && a[j] > key && Math.abs(a[j] - key) == 1){
				
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				j--;
				
			}
			
			if(Math.abs(a[j+1] - key) == 1){
			int temp = a[j+1];
			a[j+1] = a[i];
			a[i] = temp;
			}
		}
		
		
		
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
         
            boolean flag= false;
            
            for(int i=0;i<n-1;i++){
            	
            	if(a[i] > a[i+1] )
            		if(a[i] - a[i+1] == 1)
            		{
            			
            			int temp = a[i];
            			a[i] = a[i+1];
            			a[i+1] = temp;
            			
            		}
            	if(isSorted(a))
            		flag = true;
            	
            	
            	
            	
            }
            System.out.println(flag==true?"Yes":"No");
            
        }
    }
    public static boolean isSorted(int[] a){
    	
    	for(int i=0;i<a.length-1;i++)
    		if(a[i] > a[i+1])
    			return false;
    	
		return true;
    	
    	
    }
}
