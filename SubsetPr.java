import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubsetPr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       
        System.out.println(allSubsets(s));
        //char[] all = s.toArray();
        
        
    }
    public static boolean otherCon(String temp){
    	
    	char[] ch = temp.toCharArray();
    	int i=0;
    	if(temp.length()==1)
    		return true;
    	while(ch[i]=='0'){
    		return false;
    	}
    	return true;
    	
    }
    	
    	
    
    
    
    
    public static int allSubsets(String is){
        int counter =0;
    	int l= is.length();
  //  	HashSet<String> hs = new HashSet<String>();

    	for(int i=0;i<l;i++)
    	{
    		for(int j=1+i;j<l+1;j++){
    			
    			String temp;
    			temp = is.substring(i,j);
    			
                BigInteger num = BigInteger.valueOf(0);
                
                num = num.add(new BigInteger(temp));
                
               // System.out.println(num);
                BigInteger y = new BigInteger("6");
                BigInteger rem = num.mod(y);
                
                int r = rem.intValue();
                if( r==0 ){
                	if(otherCon(temp)){
               		System.out.println(temp);
                		counter++; continue;
                	}
                }
              
                
    			//System.out.println("i= "+i+"j= "+j+temp);
    		//	hs.add(temp);
    			
    		}
    		}
    		
    	
    	
    	//String[] subsets = new String[hs.size()];
    	
    	return(  counter  );
    	
    }
    	
}
