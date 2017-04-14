
import java.util.*;

public class quickSort3 {

	static int count = 0;

	public static void insertSort(int a[]) {

		for (int i = 1; i < a.length; i++) {

			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
				count--;

			}

			a[j + 1] = key;

		}

	}

	public static void quickSort(int[] a, int left, int right, int start, int end) {

		if (left < right) {

			int q = partition(a, left, right);

			quickSort(a, left, q - 1, start, end);
			quickSort(a, q + 1, right, start, end);

		}

	}

	public static int partition(int[] a, int left, int right) {

		int x = a[right];
		int i = left - 1;
		for (int j = left; j < right; j++)
			if (a[j] < x) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				count--;
			}

		int temp = a[i + 1];
		a[i + 1] = a[right];
		a[right] = temp;

		count--;
		return i + 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i] = sc.nextInt();
		}
		sc.close();
		quickSort(b, 0, n - 1, 0, n - 1);
		insertSort(a);
		System.out.println(count+1);
	}
}