import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cakeWalk {

    public static void sortArray(int[] a,int left,int right){
        
        
        if(left<right){
            
            int q = partition(a,left,right);
            sortArray(a,left,q-1);
            sortArray(a,q+1,right);
            
        }
        
        
        
    }
    
    
    public static int partition(int[] a,int l,int r){
        
        int pivot = a[r];
        int i=-1;
        
        for(int j=0;j<r;j++){
        
            if(a[j] > pivot){
                
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
                
        }   
            int temp = a[i+1];
            a[i+1] = a[r];
            a[r] = temp;
            
        
        
        return i+1;
        
        
        
        
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        
        sortArray(calories,0,n-1);
        for(int i=0;i<n;i++)
        	System.out.print(calories[i]+" ");
        
        Double sum = new Double(0.0);
        
        
        for(int i=0;i<n;i++){
            
            sum = sum + calories[i]* (Math.pow(2,i));
            System.out.println(sum);
            
            
        }
        System.out.println(sum);
    
    
    
    }
}
