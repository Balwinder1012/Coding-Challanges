import java.util.*;
public class SherlockValidString {

	public static void isValid(String s){
		
		int ascii[] = new int[26];
		for(char elem: s.toCharArray()){
			ascii[elem-'a']++;
			
		}
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<ascii.length;i++){
			
				if(ascii[i]!=0)
				
				hmap.put(i, ascii[i]);
				
			}
	
		
		Map<Integer,Integer> frequent = new HashMap<Integer,Integer>();
		
		
		for(int key: hmap.values()){
		if(frequent.containsKey(key)){
			int val = frequent.get(key);
			frequent.put(key, val);
			
			
			
		}
		else
			frequent.put(key,1);
			
			
			
		}
		
		int freq = Collections.max(frequent.values());
		
		
	
		
		int maxValue = hmap.get(frequent.get(freq));
		
		int counter=0;
		
		for(int values: hmap.values()){
			
			if(values!=maxValue)
				counter++;
			
			
		}

		System.out.println(counter > 1 ? "NO" : "YES");
			
			
			
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		if(s.length()!=1)
		isValid(s);
		else
			System.out.println(1);
		
		
	}
}
