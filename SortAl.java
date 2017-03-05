import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortAl {

	public static void qsort(BigInteger A[],int beg,int end)
	{
	 int loc;
	 if(beg<end)
	 {
	  
	  loc = partition(A,beg,end);
	  qsort(A,beg,loc-1);
	  qsort(A,loc+1,end);
	 }
	}

	public static int partition(BigInteger A[],int left,int right)
	{
	 int pivot;
	 BigInteger temp;

	 pivot=left;
	 while(left<right)
	 {

		 while(A[pivot].compareTo(A[right])!= 1 && pivot!=right ){
	    right--; 
	    }
	 
	  if(pivot==right)
	   return pivot;
	  if(A[pivot].compareTo(A[right])== 1 )
	  {
	   temp=A[pivot];
	   A[pivot]=A[right];
	   A[right]=temp;
	   pivot=right;
	  }
	  while(A[pivot].compareTo(A[left])!= (-1)  && pivot!=left)
	   left++;
	  if(A[pivot].compareTo(A[left])== (-1) )
	  {
	  temp=A[pivot];
	  A[pivot]=A[left];
	  A[left]=temp;
	  pivot=left;
	  }
	 }
	 return left;
	}
        
        
        
        
        
        
        
        
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        BigInteger A[] = new BigInteger[unsorted.length];
        for(int i=0;i<n;i++){
        	A[i] = new BigInteger(unsorted[i]);
        	//A[i] = Integer.parseInt(unsorted[i]);
        }
        
        
//       for(int i=0;i<=n-1;i++)
//    	   System.out.print(" "+A[i]);
        for(BigInteger num: A)
        System.out.print(" "+num);
        
        System.out.println();
        qsort(A,0,n-1);
        for(BigInteger num: A)
         System.out.print(" "+num);
        
    }
}
