import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class zeroOneGame {

	
	public static String othersSol(int[] seq){
		
		
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for(int el:seq)
				al.add(el);
			
			al.add(1);
			
			int a[] = new int[al.size()];
			for(int i=0;i<al.size();i++)
				a[i] = al.get(i);
		
		    int turns=0;
	        for(int i=0;i<a.length-1;i++){
	            
	            if(seq[i]==1)
	                continue;
	            int check = i;
	            while(check < a.length-1 && (a[check]==0 || a[check+1]==0))
	                check++;
	            
	            turns+=Math.max(0,check-i-2);
	            
	            i=check-1;
	            
	            
	        }
	        
	        if(turns%2==0)
	            return "Bob";
	        else
	            return "Alice";
	        
		
		
		
		
		
	}
	
	
	public static void oneMoreSol(int[] s){
		
		
		int start=-1;
        int ans = 0;
        int n = s.length;
        for (int i = 0; i < n-1; i++) {
            if (start == -1) {
                if (s[i]==0)
                    start = i;
            }
            
            else {
                if (s[i]==1&&s[i+1]==1) {
                    ans += Math.max(0,i-start-2);
                    start = -1;
                }
            }
            
            
        }
        if (start != -1) {
            ans += Math.max(n-start-2-s[n-1],0);
        }
        System.out.println((ans%2==0)?"Bob":"Alice");
		
	}
	
	
	public static void mySol(int[] a) {
		int counter = 1;
		boolean alice = false;
		boolean bob = true;
		LinkedList<Integer> ls = new LinkedList<Integer>();
		for (int num : a)
			ls.add(new Integer(num));

		if (elementExist(ls) == -1 || a.length < 2)
			System.out.println("Bob");
		else {

			while (ls.size() > 2) {
				int index = elementExist(ls);
				if (index != -1) {
					ls.remove(index);

					if (counter % 2 != 0) {

						alice = true;
						bob = false;
					} else {

						alice = false;
						bob = true;
					}

					counter++;
				} else
					break;

			}

			System.out.println(alice == true ? "Alice" : "Bob");

		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();

		for (int a0 = 0; a0 < g; a0++) {

			int n = in.nextInt();
			int[] sequence = new int[n];
			for (int sequence_i = 0; sequence_i < n; sequence_i++) {
				sequence[sequence_i] = in.nextInt();
			}

			// mySol(sequence);
			System.out.println(othersSol(sequence));

		}

	}

	public static int elementExist(LinkedList<Integer> ls) {

		Integer a[] = ls.toArray(new Integer[ls.size()]);

		for (int i = 0; i < a.length - 2; i++) {

			if (a[i] == 0 && a[i + 2] == 0)
				return i + 1;

		}

		return -1;

	}
}
