import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerLandRadioTransmitter {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
   
        
        Arrays.sort(x);
        int counter=0;
       
        int i=0;
        while(i<n){
            
            counter++;
            int covers =x[i] + k;
            
            while(i<n && x[i] <=covers)
                i++;
            
            i--;
            covers = x[i] + k;
            while(i<n && x[i] <= covers)
                i++;
            
            
            
            
            
            
        }
            
        
        
        
        System.out.print(counter);
        
    }
}
