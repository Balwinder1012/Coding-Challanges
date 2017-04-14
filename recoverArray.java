import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] file = new int[n];
        for(int file_i=0; file_i < n; file_i++){
            file[file_i] = in.nextInt();
        }
      int counter=0;
        for(int i=0;i<n;){
        	
        	int index = file[i];
        	
        	i=i+index+1;
        	counter++;
        	
        	
        }
        
        
        
        System.out.println(counter);
    }
}
