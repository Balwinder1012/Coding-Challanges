import java.util.*;
 class teamForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-->0){
			
			int n  = sc.nextInt();
			int m = sc.nextInt();
			int[] teamMem = new int[2*m];
			for(int i=0;i<2*m;i++)
				teamMem[i] =  sc.nextInt();
			
			Set<Integer> hs = new HashSet<Integer>();
			for(int e:teamMem)
			  hs.add(e);
			int counter=0;
			for(int i=1;i<=n;i++){
				if(!hs.contains(new Integer(i))){
					counter++;
				}
			}
			
			
			System.out.println(counter%2==0? "yes" : "no");
			
			
			
			
		}
	}
}
