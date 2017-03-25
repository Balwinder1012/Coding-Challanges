import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class gemStones {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<HashSet<Character>> al = new ArrayList<HashSet<Character>>();
		int n1=n;
		while(n1-->0){
			
			String s = sc.next();
			HashSet<Character> hset = new HashSet<Character>();
			for(char ch: s.toCharArray())
				hset.add(ch);
		
			al.add(hset);
		}
		int counter=0;
		
		HashSet<Character> hset = al.get(0);
		
		Character ch[] = hset.toArray(new Character[hset.size()]);
		
		for(int i=0;i<ch.length;i++){
		
		int ginti=1;
		for(int j=1;j<n;j++)
			
			if(!al.get(j).contains(ch[i]))
				ginti=0;
			
		
		counter=counter+ ginti;
		
		}
		System.out.println(counter);
		sc.close();
	}
}
