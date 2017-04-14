import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = {1,4, 3, 5, 6, 2};
		for(int elem:a)
			System.out.print(elem+" ");
		System.out.println();
		for(int i=1;i<a.length;i++){
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j] > key){
				
					a[j+1]=a[j];
					
					
					
					j--;
			}
			
			a[j+1]=key;
			for(int elem:a)
				System.out.print(elem+" ");
			
			System.out.println();
			
				
	
			
			
		}
		for(int elem:a)
			System.out.print(elem+" ");
		
	}
}
