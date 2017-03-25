import java.util.*;

public class MakingAnagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int[] chars = new int[26];
	    for (char c1 : a.toCharArray()) { chars[c1-97]++; }
	    for (char c2 : b.toCharArray()) { chars[c2-97]--; }
	    int count = 0;
	    for(int i: chars) {count += Math.abs(i);}

	    System.out.println(count);
			
	}
}
