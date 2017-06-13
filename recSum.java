import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class recSum {
//245  
    
    
    public static BigInteger recSolve(BigInteger num){
        
        if(num.divide(BigInteger.valueOf(10)).equals(BigInteger.ZERO))
            return num;
        
        BigInteger temp = num;
        BigInteger sum= BigInteger.ZERO;    
    //    long index=1;
        while(temp.compareTo(BigInteger.ZERO)!=0){
         
        //	long power = (long) Math.pow(10,index);
         BigInteger rem = temp.mod(BigInteger.valueOf(10));
         temp = temp.divide(BigInteger.valueOf(10));
         sum = sum.add(rem);
        
     }
        return recSolve(sum);
        
        
        
    }
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    BigInteger n = sc.nextBigInteger();
    int k  = sc.nextInt();
    BigInteger temp = n;
    BigInteger sum= BigInteger.ZERO;    
  //  BigInteger index = BigInteger.ONE;
     while(temp.compareTo(BigInteger.ZERO)!=0){
         
         BigInteger rem = temp.mod(BigInteger.valueOf(10));
         temp = temp.divide(BigInteger.valueOf(10));
         sum = sum.add(rem);
       
        
     }
     System.out.println(recSolve(sum.multiply(BigInteger.valueOf(k))));   
    
    System.out.println();
    
   System.out.println(digit_sum(new BigInteger("748926492460264027402730273026493649364834")));
    
    
    }
    
    
 static BigInteger digit_sum(BigInteger n){
        
        BigInteger bi1 = n.subtract(new BigInteger("1"));
        BigInteger bi2 = bi1.divide(new BigInteger("9"));
        BigInteger bi3 = bi2.multiply(new BigInteger("9"));        
        return n.subtract(bi3);

    }
    
}