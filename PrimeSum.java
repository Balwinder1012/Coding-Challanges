import java.util.*;

public class PrimeSum {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int N = sc.nextInt();
		
		int primeArray[] = getPrimes(N);
		
		int len = primeArray.length;
		
		int counter=0;
		for(int a:primeArray)
		System.out.print(a+" ");
		System.out.println();
		for(int i=2;i<len;i++){
				boolean flag=false;
				
				int sum=0;
				int index=0;
				if(sum==primeArray[i])
					flag=true;
				while(flag!=true && index < i){
					
					sum=sum + primeArray[index];
					index++;
					if(sum==primeArray[i]){
						flag=true;
						break;
					}
				}
				
				if(flag)
					counter++;
					
				
			}
		
		System.out.print(counter);
			
			
			
		}
	
	public static int[] getPrimes(int n){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
			
			boolean flag = true;
			for(int j=2;j<=i/2;j++){
				
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag==true)
				al.add(i);
			
			
		}
		int[] array = new int[al.size()];
	
		for(int i=0;i<al.size();i++)
			array[i] = al.get(i);
		
		return array;

		
		
	}
	
}
