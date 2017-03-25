
import java.util.*;

public class PalindromeIndex {

	public static boolean isPalindrome(String s) {

		String r = new StringBuilder(s).reverse().toString();
		if (s.equals(r))
			return true;
		else
			return false;

	}

	public static String deleteChar(String s, int index) {

		StringBuilder sb = new StringBuilder(s);

		return (sb.deleteCharAt(index).toString());

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num-- > 0) {

			String s = sc.next();
			boolean flag = false;
			char ch[] = s.toCharArray();
			int n = ch.length;
			if (isPalindrome(s))
				System.out.println(-1);
			else {
			
				int left = 0;
				int right = ch.length - 1;
				while (ch[left] == ch[right]) {
					left++;
					right--;
				}

				String temp = deleteChar(String.copyValueOf(ch), left);

				if (isPalindrome(temp)) 
					System.out.println(left);

			    else {
					temp = deleteChar(String.copyValueOf(ch), right);

					if (isPalindrome(temp)) 
						System.out.println(right);

				}

			}
		}

		sc.close();
	}
}
