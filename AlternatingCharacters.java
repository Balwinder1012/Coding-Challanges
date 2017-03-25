import java.util.*;
public class AlternatingCharacters {

	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
	while(testCases-->0){
	  String s = sc.next();
	  LinkedList<Character> ls = new LinkedList<Character>();
		
      char [] ch = s.toCharArray();
      char last = 0;
	  for(int i=0;i<ch.length;i++){
		if(last!=ch[i])
			ls.add(new Character(ch[i]));
				
		last=ch[i];
				
		}
		System.out.println(s.length()-ls.size());
		
		}
		
		
		
		sc.close();
	}
}
