import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       in.close();
        
      
        
        System.out.println(s.length() - s.replaceAll("[A-Z]", "").length()  +1);
        
    }
}
