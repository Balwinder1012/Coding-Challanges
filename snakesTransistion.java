import java.util.*;
 class snakesTransistion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int arr[][] = new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					arr[i][j] = sc.nextInt();
			
			int counter = 0;
			while(!allEqual(arr,m,n)){
				
				int newAr[][] = new int[m][n];
				for(int i=0;i<m;i++)
					for(int j=0;j<n;j++){
						int max = arr[i][j];
						
						if(i>=0 && i<m-1){
							max = arr[i+1][j];
						}
						if(j>=0 && j<n-1)
							max = Math.max(max, arr[i][j+1]);
						
						if(i<m-1 && j<n-1)
							max = Math.max(max, arr[i+1][j+1]);
						
						if(i>0)
							max = Math.max(max,arr[i-1][j]);
						if(j>0)
							max = Math.max(max, arr[i][j-1]);
						if(i>0&&j>0)
							max = Math.max(max, arr[i-1][j-1]);
						
						if(i<m-1  && j>0)
						   max = Math.max(max, arr[i+1][j-1]);
								
						if(j<n-1 && i>0)		
						  max = Math.max(max, arr[i-1][j+1]);		
						
						newAr[i][j] = max;
						
						
					}
				
				System.arraycopy( newAr, 0, arr, 0, newAr.length );
				counter++;
				
			}
			
			System.out.println(counter);
			
		}
	}
	public static boolean allEqual(int[][] arr,int m,int n){
		
		int a = arr[0][0];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(arr[i][j]!=a) 
					return false;
		return true;
		
	
		
		
	}
}
