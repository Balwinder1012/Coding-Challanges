import java.util.*;

class ironman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while (testCases-- > 0) {

			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(solve(a));

		}
		sc.close();
	}

	static long solve(int[] a) {
		int n = a.length;

		if (n % 2 == 0) {

			if(a[0]>a[n-1]){
			long counter = a[0];

			int c[] = new int[n - 1];
			for (int i = 0; i < n - 1; i++)
				c[i] = a[i + 1];
			
			
			return counter + solve(c);
			}
			else{
				int c1[] = new int[n - 1];
				long counter1 = a[a.length - 1];
				for (int i = 0; i < n - 1; i++)
					c1[i] = a[i];
				
				return (counter1 + solve(c1));
			}
		}

		else {

			int b[] = new int[n];
			int mid = n / 2;
			int j = 0;
			for (int i = 0; i < n; i++) {

				if (i <= mid) {
					b[i] = i + 1;
					j = i;
				} else {
					b[i] = j;
					j--;
				}
			}
			long counter = 0;
			for (int i = 0; i < n; i++) {
				int diff = a[i] - b[i];
				if (diff >= 0) {
					counter = counter + diff;
				} else {

					int c[] = new int[n - i];

					for (int k = 0; k < c.length; k++)
						c[k] = a[i + k];

					long sum = 0;
					for (int l = 0; l < i; l++)
						sum += a[l];

					//////////////////////////////////////////////////////////////////////////////////////////////////

					int d[] = new int[i + 1];
					for (int k = 0; k < d.length; k++)
						d[k] = a[k];

					long sum1 = 0;
					for (int l = i + 1; l < a.length; l++)
						sum1 += a[l];

					return Math.min(sum + solve(c), sum1 + solve(d));
					////////////////////////////////////////////////////////////////////////////////////////////////////
					
				}
			}
			return counter;
		}

	}

}
