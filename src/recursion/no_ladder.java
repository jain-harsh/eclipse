package recursion;

import java.util.Scanner;

public class no_ladder {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		int end = scn.nextInt();
//	System.out.println(ladder(0,end));
		printSS("abc", "");
		printKPC("145", "");
	}

	public static void printSS(String str, String ans) {

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		String roq = str.substring(1);
		char ch = str.charAt(0);
		printSS(roq, ans);// no
		printSS(roq, ch + ans);// yes
	}

	public static void printKPC(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		String roq = str.substring(1);
		char ch = str.charAt(0);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			printKPC(roq, ans + code.charAt(i));
		}

	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";

	}
}
