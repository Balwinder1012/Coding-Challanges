import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class howManySubstrings {

	
	public static void allSubsets(String s,int left,int right){
		Set<String> al = new HashSet<String>();
		
		if(left==right) System.out.println("1");
		else{
		for(int i=left;i<=right;i++){
			
			for(int j=left;j<=right;j++){
				
				String temp = s.substring(i,j);
				System.out.println("Hello-" +temp+" i= "+i+"j="+j);
				al.add(temp);
			}
			
		}
		System.out.println(al.size());
		}
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
           
            allSubsets(s,left,right);
            
            
        }
        
        
    }
}
