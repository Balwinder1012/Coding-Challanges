import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class whatAreTheOdds {
	
	//Not Solved

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
       int bigCounter=0;
        for(int i=0;i<n;i++){
        	
        	
        	for(int j=i;j<n;j++){
        		
        		int temp[] = s;
        		for(int k=i;k<=j;k++)
        			temp[k] = 0;
        		int counter=0;
        		int length = 0;
        		
        		for(int y=i;y<=j;y++)
        		{
        			length++;
        			
        			
        		}
        		int sum[] = new int[temp.length - length];
        		
        		
        		int count=0;
        		for(int r=0;r<n   ;r++){
        			if(!(r>=i && r<=j)){
        			 sum[count] = temp[r];
        			 count++;
        			}
        		}
        		
        		
        		for(int p=0;p<sum.length;p++)
        			counter = counter + sum[p];
        		
        		
        		length = sum.length;
        		
        		if(length==1)
        			break;
        		
        		if(counter%2!=0)
        			break;
        		
        		bigCounter++;
        			
        		
        	
        		
        		
        		
        		
        		
        		
        	}
        	
        	
        	
        	
        	
        }
       
        System.out.println(bigCounter);
        
        
    }
    
  
}
