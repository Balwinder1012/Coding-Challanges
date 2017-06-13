import java.util.*;
public class theBirthdayTears {

	static int counter=0;
	public static boolean containsSame(String s){
		boolean flag = true;
		char ch = s.charAt(0);
		for(char c:s.toCharArray())
			if(c!=ch){
				flag = false;
				return flag;
				
			}
		
		return flag;
				
		
		
	}
	public static int solveRecursivley(String s){
		
		
		if(s.length()==1)
			return counter;
		if(containsSame(s))
			return counter;
		
		
			counter++;
			return solveRecursivley(s.substring(0,s.length()/2)) + solveRecursivley(s.substring(s.length()/2,s.length()));
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
			
			String s = sc.next();
			counter=0;
			if(s.length()%2==0)
			System.out.println(solveRecursivley(s));
			else
				System.out.println("-1");
			
			
			
		}
		
		
		
	}
}
