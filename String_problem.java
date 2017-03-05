
import java.util.*;


public class String_problem {
/*
	static String initialString="";
	static String finalString = "aabaabaabaabsfsfs";
	
	static StringBuilder fs = new StringBuilder(finalString);
	static StringBuilder is = new StringBuilder(initialString);
	
	static int cost = 0;
	static int index=2;
	
	
	public static void initializeProblem(){
		 
			is.append(fs.charAt(0));
	        cost = cost + 4;
	        is.append(fs.charAt(1));
	        cost = cost +4;
		
		
	}*/
	/*
	public static boolean isComplete(){
		return(is.length()!=fs.length());
		
	}
*/    public static void main(String[] args) {
       
	String initialString="";
    //String finalString = "";

   

   
   

	Scanner sc = new Scanner(System.in);
	
	int t=sc.nextInt();
	int N[] = new int[t];
	int p=0;
	int A[] = new int[t];
	int B[] = new int[t];
	String finalString[] = new String[t];
	
	
	for(int u=0;u<t;u++){

		N[u]=sc.nextInt();
		 A[u]=sc.nextInt();
		 B[u]=sc.nextInt();
		finalString[u]=sc.next();	
		
	}
	
	while(t>0){
		
	int index=0;
    int cost = 0;
	
	
	
	    StringBuilder fs = new StringBuilder(finalString[p]);
	    StringBuilder is = new StringBuilder(initialString);	
    	//The following function gives first two characters to initialString
  //  	initializeProblem();
  
    	
     while( is.length()!=fs.length() ){
    	 
    	 
     String[] allSubsets = getSubsets(is);
     int largest = 0;
  
     for(String sub: allSubsets){
    	 
    	 int i=index;
    	 int size=0;
    	 int i1 =0;
    	 
    	 
    	 while(sub.charAt(i1) == (fs.charAt(i))){
    		 
    		 size++;
    		 i++;
    		 i1++;
    		 
    		 if(i1==sub.length() || i==fs.length())
    			 break;
    		 
    	 }
    	 
    	 
    	 if(size > largest)
    		 largest = size;
    	 
     }
     //(B[p] -A[p])
     int checkA=0;
     int checkB=B[p];
     
  //  System.out.println("dff"+p); 
     for(int r=0;r<largest;r++){
    	 checkA = checkA + A[p];
     }
    //System.out.println("Check A = "+checkA+"Check B= "+checkB); 
     if( checkB <= checkA ){
 //if(largest>1){
    	 
    	// System.out.println("In if");
    	 cost = cost + B[p];
  
    	 while(largest!=0){
    		 is.append(Character.toString(   fs.charAt(index)        ));
    	 		index++;
    	 		
    	 		largest--;
    	 }
     }
     else
     {
    	// System.out.println("In else");
    	 is.append(fs.charAt(index));
    	 index++;
    	 cost+=A[p];
    	 
     }
 
     }
     System.out.println("Cost= "+cost);
     
     t--;
     p++;
//     System.out.println("dff");
	}
    sc.close();	
    }
    
    
    
    
    
    public static String[] getSubsets(StringBuilder is){
    	
    
    	int l= is.length();
    	//String subsets[] = new String[(l*l+1)/2];
    	
    
    	
    	HashSet<String> hs = new HashSet<String>();
    	
    	
    	
    	
    	for(int i=0;i<l;i++)
    	{
    		for(int j=1+i;j<=l;j++){
    			
    			String temp;
    			temp = is.substring(i, j); 
    			//System.out.println("i= "+i+"j= "+j+temp);
    			hs.add(temp);
    			
    			
    		}
    		
    	}
    	
    	String[] subsets = new String[hs.size()];
    	
    	return(  hs.toArray(subsets)  );
    	
    	
    	
    
    	
    }
}
