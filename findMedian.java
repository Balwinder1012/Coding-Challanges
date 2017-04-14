import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// Problem Link-	https://www.hackerrank.com/challenges/find-the-median/
public class findMedian {

    public static int counter=0;
    public static boolean flag=true;
   
    public static void FindMedian(int[] a){
        
        for(int i=0;i<a.length;i++){
            
            int p[] = Partition(a,i);
            if(p[0]==p[1]){
                
                System.out.println(a[i]);
                break;
                
            }
            
            
        }
        
        
        
        
        
        
    }
    public static int[] Partition(int[] a,int index){
        
    	
        int pivot = a[index];
        int left=0;
        int right=0;
        int equal=0;
        for(int j=0;j<a.length;j++){
            
            if(j==index)
                continue;
            
            if(a[j]==pivot)
                equal++;
            
            else if(a[j] < pivot)
                left++;
                
            else
                right++;
            
        }
        
        
        if(left!=right)
            for(int i=0;i<equal;i++){
                
                if(left < right)
                    left++;
                else
                    right++;
                
            }
            
            
        int ar[] = new int[2];
        ar[0] = left;
        ar[1] = right;
        return ar; 
        
        
    }
    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
       FindMedian(a);
        
    
    }
}