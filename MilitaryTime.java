import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MilitaryTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        //String time = in.next();
        String time = "07:05:45PM";
        String[] t = time.split(":");
       
        int hr = Integer.parseInt(t[0]);
        int min = Integer.parseInt(t[1]);
        char[] ca = t[2].toCharArray();
        int sec = 10*Character.getNumericValue(ca[0]) + Character.getNumericValue(ca[1]);
        String med = Character.toString(ca[2]);
        
       
       if(med.equals("P") && hr<12)
    	   hr+=12;
       if(med.equals("A") && hr==12)
    	   hr=0;
      
       
       System.out.print(hr+":"+min+":"+sec+med+"M");
        
        
        
    }
}
