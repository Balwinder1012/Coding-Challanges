import java.util.*;

public class PartitionAlgo {

	static void partition(int[] ar) {

		int pivot = ar[0];
		ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        
        equal.add(pivot);

		for (int i = 1; i < ar.length; i++) {

			if (ar[i] < pivot)
				left.add(ar[i]);
			else if (ar[i] == pivot)
               equal.add(ar[i]);	
            else
				right.add(ar[i]);

		}

	
        for(int i=0;i<left.size();i++)
        	System.out.print(left.get(i)+" ");
        for(int i=0;i<equal.size();i++)
        	System.out.print(equal.get(i)+"");
        
        for(int i=0;i<right.size();i++)
        	System.out.print(right.get(i)+"");
        

	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
}
