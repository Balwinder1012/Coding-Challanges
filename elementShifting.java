import java.util.*;
public class elementShifting{
	
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		while(number-->0){
			boolean check = false;
			int len = sc.nextInt();
			String s = sc.next();
			boolean check1 = false;
		//	boolean check2 = false;
			s = s.replace(".","");
		//	System.out.println(s);
			
			int letters[] = new int[26];
			
			for(char ch:s.toCharArray()){
				letters[ch-'A']++;
			}
			
			if(s.length()==0)
				System.out.println("Valid");
			else{
			if(letters['H'-'A']==letters['T' - 'A']){
				
				for(char ch:s.toCharArray()){
					
					if(ch == 'T' && check1 == false){
						check = false;
						break;
					}
					if(ch == 'H' && check1 == true){
						check = false;
						break;
						
					}
					if(ch=='T' && check1== true){
						check1 = false;
						check = true;
						continue;
					
					}
					check1 = true;
					check = true;
						
					
					
				}
				
				
			}
			
				System.out.println(check==false?"Invalid":"Valid");
			
			}
			
			
			
		}
	}
	
}