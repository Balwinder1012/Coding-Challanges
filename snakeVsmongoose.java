import java.util.*;
class snakeVsmongoose{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int testCases = sc.nextInt();
	  while(testCases-->0){
	  	
	  	String s = sc.next();
	  	char ch[] = s.toCharArray();
	  	int letters[] = new int[26];
	  	int n=ch.length;
	  	if(n==1){
	  		
	  		System.out.println(ch[0]=='m' ? "mongooses" : "snakes");
	  		
	  		
	  	}
	  	else{
	  	for(char c:ch)
	  		letters[(int)c-'a']++;
	  	
	  	
	  	boolean check = true;
	  	for(int i=0;i<n;i++){
	  		
	  		if(ch[i]=='m'){
	  		
	  			if(i!=0 && ch[i-1]=='s'){
	  				check = false;
	  				ch[i-1]='*';
	  				letters[(int) 's' - 'a']--;
	  			}
	  			if(check==true && i+1 <= n-1 && ch[i+1]=='s'){
	  				ch[i+1]='*';
	  				letters[(int) 's' - 'a']--;
	  			}
	  		}
	  	check = true;
	  	}
	  	System.out.println(letters[(int)'m'-'a']> letters[(int)'s'-'a'] ? "mongooses" : (letters[(int)'m'-'a']== letters[(int)'s'-'a'] ? "tie" : "snakes") );	
	  
	  //	for(int i=0;i<n;i++)
	  //		System.out.print(ch[i]);
	  	}
	  }
	
	  
	
	
	  sc.close();
	}
	
}