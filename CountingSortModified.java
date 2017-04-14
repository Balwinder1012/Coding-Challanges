import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSortModified {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 100;
		int a[] = new int[n];
		int c[] = new int[max];
		int sortedInt[] = new int[n];
		String sortedString[] = new String[n];
		String s[] = new String[n];

		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
			s[i] = sc.next();
			if (i >= 0 && i < n / 2)
				s[i] = "-";

		}

		for (int i = 0; i < n; i++)
			c[a[i]]++;

		int d[] = new int[max];
		d[0] = 0;

		for (int i = 1; i < max; i++) {

			d[i] = d[i - 1] + c[i - 1];

		}
		for (int i = 0; i < n; i++) {

			sortedInt[d[a[i]]] = a[i];
			sortedString[d[a[i]]] = s[i];
			d[a[i]]++;

		}

		for (int i = 0; i < n; i++)
			System.out.print(sortedString[i] + " ");

		sc.close();
	}
}