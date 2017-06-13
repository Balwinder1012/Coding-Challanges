import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class modifiedFib {

	static int t1=1;
	static int t2=2;
	public static BigInteger modFib(int n,BigInteger[] mem){
		
		if(n<=0)
			return BigInteger.valueOf(0);
		
		else if(n==1)
			return BigInteger.valueOf(2);
		
		else if(mem[n].equals(BigInteger.ZERO))
			mem[n] = modFib(n-1,mem).multiply(BigInteger.valueOf(4)).add(modFib(n-2,mem));
		
		return mem[n];
	
	}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int test = sc.nextInt();
        while(test-->0){
        	BigInteger n = sc.nextBigInteger();
       //  int n = sc.nextInt();
        
        BigInteger[] mem = new BigInteger[50];
        BigInteger big = new BigInteger("0");
        BigInteger sum = new BigInteger("0");
        for(int i=0;i<mem.length;i++)
        	mem[i] = BigInteger.ZERO;
        mem[0]  = BigInteger.valueOf(0);
        mem[1] = BigInteger.valueOf(2);
       
        int index=0;
       // int fr = n;
       
        
        while(sum.compareTo(n)!=(1)  ){
            //big =sum;
            BigInteger gs = new BigInteger("0");
            gs = modFib(index,mem);
        //  System.out.println("Checking "+gs);
          sum  = sum.add(gs);
        index++;
        } 
        
        BigInteger bi = BigInteger.valueOf(0);

        for(int i=0;i<mem.length;i++)
        System.out.println(mem[i]+" ");
        
        System.out.println();
        
            for(int i=0;i<mem.length;i++)
           {
//            	 BigInteger bih = BigInteger.valueOf(0);
//            	 bih = bi;
//            	
            	if(bi.compareTo(n)!=1){
            	
            		big = bi;
            		bi = bi.add(mem[i]);
            	}
            	else
            		break;
            	
            }
            	
            	
            	//System.out.println(mem[i]+" ");
        	System.out.println(big);

        }
    
    
    }
}