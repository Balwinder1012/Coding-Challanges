import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
       
        int pairs = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0 ; i<n; i++)
            {
            
            int num = in.nextInt();
            
            int mod = num % k ;
            int need = (k-mod)%k ;       // mod = 2 num = 17 k=3 need =2

          //  System.out.print(need+" ");
            Integer count = map.get(need);
            if(count!= null) pairs+=count;
            
            count = map.get(mod);
            if(count!=null)
                map.put(mod,count+1);
            else
                map.put(mod,1);
        
        }
        
        System.out.println(pairs);
        in.close();
        
    }
}
