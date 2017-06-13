
import java.util.*;

public class temple{

	public static void main(String[] args){
	
		int test;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		while(test-->0){
		
			int n = sc.nextInt();
			int a[] = new int[n];
			boolean check = true;
			for(int i=0;i<n;i++)
			   a[i] = sc.nextInt();
			   
			if(n%2==0 || a[0]!=1)
			check = false;
			
			
			else
			{   
			int r = (int)n/2;
			int i=0;
			while(i<n-1){
				if(i<r){
				if(a[i+1] - a[i]  == 1){
					i++;
				
				
					continue;
				}
				else{
					check = false;
					break;
				}
				}
				//if(i==r-1)
				  // i=i+2;
				
				if(i>=r){
				if(a[i] - a[i+1] == 1){
				i++;
					continue;
				}
				else{
					check = false;
					break;
				
				}
				
				}
			
				
			
				
				
			i++;
			}
			}  
			
			System.out.println(check == false ? "no" : "yes");
			 
		
		}
	
	}


}