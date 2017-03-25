import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ModularGamesOfNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[p];
        for(int a_i=0; a_i < p; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[q];
        for(int b_i=0; b_i < q; b_i++){
            b[b_i] = in.nextInt();
        }
        int sum[]=new int[n];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                int x=(a[i]+b[j])%n;
                sum[x]++;
            }
        }
        int flag=0;
        for(int i=n-1;i>=0;i--){
            if(sum[i]==0){
                flag=1;
                System.out.println(n-i);
                break;
            }
        }
        if(flag==0){
            int min=sum[0];
            int pos=0;
            for(int i=1;i<n;i++){
                if(sum[i]<=min){
                    min=sum[i];
                    pos=i;
                }
            }
            System.out.println(n-pos);
        }
    }
}
