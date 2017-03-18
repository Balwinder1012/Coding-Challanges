import java.util.*;


public class HackerRankInString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            
            String s = in.next();
            System.out.println(doesExist(s) ? "Yes" : "No");
        }
        
        
        
    }
    public static boolean doesExist(String s){
    	
    	int index=0;
 
    	String hrank = "hackerrank";
    	
    	for(int i=0;i<s.length();i++){
    	
    		if(hrank.charAt(index)==s.charAt(i))
    			index++;
    		
    		if(index==hrank.length())
    			return true;
    		
    	}
    	
    	return false;
    }
}
