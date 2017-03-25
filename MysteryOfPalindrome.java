import java.util.*;
public class MysteryOfPalindrome {

	public static boolean checkString(char[] ch){
		
		String s = String.copyValueOf(ch);
		String r = new StringBuilder(s).reverse().toString();
		
		
		if(s.equals(r))
	
			return false;
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n-->0){
			int counter=0;
			String s = sc.next();
			char ch[] = s.toCharArray();
			for(int i=s.length()-1 ;i>=0 && checkString(ch);i-- ){
				
				while(ch[i]!='a'){
				  ch[i] = (char) (ch[i] -1);
				  counter++;
				  if(!checkString(ch))
				    break;
				}
				
				
				
				
				
			}
			
			
			
			System.out.println(counter);	
			
		}
		
	}
	
}
