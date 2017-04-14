import java.util.*;
public class dictWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char temp;
		int f = sc.nextInt();
		char[] ch = s.toCharArray();
		for(int j=s.length()-1;j>=0;j--){
			  temp = (char) (ch[j] + f);
				
			
			if(temp > 'z')
				  continue;
			
			ch[j] = temp;
			break;
		}
		System.out.println(String.copyValueOf(ch));
			
		
	}
}
