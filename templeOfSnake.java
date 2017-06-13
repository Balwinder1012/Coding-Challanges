import java.util.*;
 class templeOfSnake {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCases = sc.nextInt();
	while(testCases-->0){
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		caller(a,0);
		/*
		if(n%2==0){
			
			int counter=0;
			while((a[0]--)!=0)
				counter++;
			
			int c[] = new int[n-1];
			for(int i=0;i<n-1;i++)
				c[i] = a[i+1];
			
			System.out.println(counter+solve(c));
			
			
		}
		else{
		
			System.out.println(solve(a));
		}	
			*/
		
		
	}
	}

	static void caller(int[] a,int sum){
		int n=a.length;


		if(n%2==0){
			
			int counter=0;
			while((a[0]--)!=0)
				counter++;
			
			int c[] = new int[n-1];
			for(int i=0;i<n-1;i++)
				c[i] = a[i+1];
			
			System.out.println(sum + counter+solve(c));
			
			
		}
		else{
		
			System.out.println(sum + solve(a));
		}	
		

		
	}
	static int solve(int[] a){
		int n=a.length;
		
		
		int b[] = new int[n];
		int mid = n/2;
		int j=0;
		for(int i=0;i<n;i++){
			
			if(i<=mid){
				b[i] = i+1;
				j=i;
			}
			else{
				b[i] = j;
				j--;
			}
		}	
		int counter=0;
		for(int i=0;i<n;i++){
			int diff = a[i] - b[i];
			if(diff>=0){
			counter = counter + diff;
			}
			else{
				int c[] = new int[n-i];
				
				for(int k=0;k<c.length;k++)
					c[k] = a[i+k];
				
				int sum=0;
				for(int l=0;l<i;l++)
					sum+=a[l];
				
				//return sum + solve(c);
				 caller(c,sum);
				
			}
		}
		return counter;
			}

}
