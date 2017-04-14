import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class advancedInsertSort {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int j=0;j<n;j++){
                ar[j]=in.nextInt();
                //System.err.println(ar[j]);
            }
            long c = insertSort(ar);      
            System.out.println(c);
        }
}
    
    
    public static long insertSort(int[] a)
    {
         long count = 0;
          int i;
        int j;
        int key;
        int n=a.length;
        
        int orig[] = new int[n];
        
        for(int k=1;k<n;k++)
        	orig[k]=a[k];
        	
    //    LinkedList<Integer> orig = new LinkedList<Integer>();

       LinkedList<Integer> sorted = new LinkedList<Integer>();
        
//        
//        for(i=0;i<n;i++){
//            
//            orig.add(a[i]);
//            
//        }
//         
        for(i=1;i<n;i++){

        j=i-1;
        key = a[i];

        while(j>=0 && key < a[j]){
            a[j+1] = a[j];
            j--;
          

        }
    
        a[j+1]=key;
       

    }
        
        
       for(i=0;i<n;i++){
           
           sorted.add(a[i]);
           
       }
       
       
       
       for(i=0;i<n;i++){
    	   
    	//   int indexOrig=0;// = hmapOrig.get(a[i]);
    	   
    	   int indexSorted=0;// = hmapSorted.get(a[i]);
    	   
    	   for(i=0;i<n;i++)
    		   if(sorted.get(i)==orig[i])
    		   {
    			   indexSorted = i;
    			   sorted.remove(i);
    			   break;
    		   }
    	   
    	   
    	   
    	   count+= Math.abs(i - indexSorted);
    	   
    	   
       }
       
       
        
        return count;
        
    }
    
   
    
    
}
