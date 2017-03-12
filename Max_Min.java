import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Max_Min {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        long max, min, sum;
        sum = max = min = in.nextLong();

        for(int i=1; i<5;i++){
            long temp = in.nextLong();
            sum += temp;
            
                if(temp < min) 
                    min = temp;
                
            
                if(temp > max) 
                max = temp;
            
        }

        System.out.print((sum -max) + " " + (sum - min));
    }
}
