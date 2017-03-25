import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class beautifulIntegers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            
            int len = s.length();
            
                boolean beautiful = false;

                for (int i = 0; i < len / 2; i++) {
                    String firstStr = s.substring(0, i + 1);
                    long first = Long.parseLong(firstStr);

                    if (testStringWithNumber(s.substring(i + 1), first)) {
                        beautiful = true;
                        System.out.println("YES " + first);
                        break;
                    }
                }

                if (!beautiful) {
                    System.out.println("NO");
                }
        }
        in.close();
    }
    
    private static boolean testStringWithNumber(String s, long n) {
        if (s.length() == 0) {
            return true;
        }
        long target = n + 1;
        String targetStr = "" + target;
        int targetLen = targetStr.length();
        
        String rem = s;
        
        while (rem.length() >= targetLen) {
            if (!rem.startsWith(targetStr)) {
                return false;
            }
            
            target++;
            rem = rem.substring(targetLen);
            targetStr = "" + target;
            targetLen = targetStr.length();
        }
        
        return rem.length() == 0;
    }
}
