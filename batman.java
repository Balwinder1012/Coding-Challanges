import java.util.*;
 class batman {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCases = sc.nextInt();
	while (testCases-- > 0) {

		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		solve(a);
	}
	sc.close();
}
 static void solve(int[] a){
	 
	 	int n=a.length;
		int counter=1;
		long check=Long.MAX_VALUE;
		while(counter<=n){
			
			int b[] = new int[counter];
			
			int mid = counter / 2;
			int j = 0;
			for (int i = 0; i < counter; i++) {

				if (i <= mid) {
					b[i] = i + 1;
					j = i;
				} else {
					b[i] = j;
					j--;
				}
			}

			long diff = addAll(a) - addAll(b);
			
			check = Math.min(diff, check);
			counter+=2;
			if(counter>30)
				break;
		}
		
		System.out.println(check);
		

 }
static long addAll(int c[]){
	long sum=0;
	for(int a:c)
		sum+=a;
	return sum;

}

}