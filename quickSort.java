import java.util.Scanner;

public class checking {

	private static int as[];

	public static void qsort(int A[],int beg,int end)
	{
	 int loc;
	 if(beg<end)
	 {
	  int i;
	  loc = partition(A,beg,end);
	  qsort(A,beg,loc-1);
	  qsort(A,loc+1,end);
	 }
	}
	public static int partition(int A[],int left,int right)
	{
	 int x,i,j,temp,pivot;

	 pivot=left;
	 while(left<right)
	 {
	  //scanning from right to left
	  while(A[pivot]<=A[right] && pivot!=right)
	    right--;
	  //interchange the pivot element and that element which is scanned
	  if(pivot==right)
	   return pivot;
	  if(A[pivot]>A[right])
	  {
	   temp=A[pivot];
	   A[pivot]=A[right];
	   A[right]=temp;
	   pivot=right;
	  }
	  while(A[pivot]>=A[left] && pivot!=left)
	   left++;
	  if(A[pivot]<A[left])
	  {
	  temp=A[pivot];
	  A[pivot]=A[left];
	  A[left]=temp;
	  pivot=left;
	  }
	 }
	 return left;
	}

	public static void main(String[] args){

 
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 String[] unsorted = new String[n];
 for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
     unsorted[unsorted_i] = in.next();
 }

 int A[] = new int[n];
 for(int i=0;i<n;i++)
 {
	 A[i] = Integer.parseInt(unsorted[i]);
 }

 for(int num: A){
	 System.out.print(num+" ");
 }
 System.out.println();
 
 
 qsort(A,0,n-1);
 for(int num: A){
	 System.out.print(num+" ");
 }
 
}

		
		
		
		
	
}
