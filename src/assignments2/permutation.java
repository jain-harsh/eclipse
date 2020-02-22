package assignments2;

public class permutation {
	public static void main(String[] args) {

		permutation("abc", "");
	}

	public static void permutation(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String roq = str.substring(0, i) + str.substring(i + 1);
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j))
					return;
			}
			permutation(roq, ans + ch);
		}
	}
}
