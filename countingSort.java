import java.util.*;

public class countingSort{
	
	
	

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int max=10;
    int a[] = new int[x];
    int c[] = new int[max];
    int b[] = new int[x];
    for(int i=0;i<x;i++)
    	a[i]=sc.nextInt();

    
   
    for(int i=0;i<x;i++)
    	c[a[i]]++;

    
  
    for(int i=1;i<max;i++)
        c[i]+=c[i-1];
        
    

    for(int i=0;i<x;i++){
    	b[c[a[i]]-1] = a[i];
    	c[a[i]]--; 
     
    }
 
    for(int i=0;i<x;i++)
        System.out.printf("%d ",b[i]);

  }
}
