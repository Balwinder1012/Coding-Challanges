import java.util.*;

public class Anagrams {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while (testCases-- > 0) {

			String string = sc.next();
			int l = string.length();
			int m = l / 2;
			String stringA = string.substring(0, m);
			String stringB = string.substring(m);
			if (stringA.length() == stringB.length()) {
				int counter = 0;
				LinkedList<Character> ls = new LinkedList<Character>();

				for (char c : stringA.toCharArray())
					ls.add(new Character(c));

				for (char c : stringB.toCharArray()) {
					if (!ls.contains(new Character(c)))
						counter++;
					else
						ls.remove(new Character(c));
				}

				System.out.println(counter);

			} else
				System.out.println(-1);

		}

		sc.close();
	}
}
