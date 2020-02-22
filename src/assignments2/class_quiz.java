package assignments2;

import java.util.ArrayList;

public class class_quiz {
	public static void main(String[] args) {
		quiz("a1b2c3", "a1b2c3", 0, 0);
//		quiz2("a1b2", "",0);
	}

	public static void quiz(String str, String ans, int pos, int count) {
		if (pos == str.length()) {
			return;
		}
		if (pos == 0) {
			System.out.println(ans);
		}
		if (pos > 0 && count == 1) {
			System.out.println(ans);
		}
		if (str.charAt(pos) >= 'a' && str.charAt(pos) <= 'z') {
			count = 1;
			quiz(str, ans.substring(0, pos) + Character.toUpperCase(ans.charAt(pos)) + ans.substring(pos + 1), pos + 1,
					count);
		}
		if (str.charAt(pos) >= 'A' && str.charAt(pos) <= 'Z') {
			count = 1;
			quiz(str, ans.substring(0, pos) + Character.toLowerCase(ans.charAt(pos)) + str.substring(pos + 1), pos + 1,
					count);
		}
		count = 0;
		quiz(str, ans, pos + 1, count);
	}

	public static void quiz2(String str, String ans,int pos) {
		
		if(ans.length()==str.length()) {
			System.out.println(ans);
			return;
		}
		if(pos==str.length()) {
			return;
		}
		char ch=str.charAt(pos);
		if (ch >= 'a' && ch <= 'z') {
			quiz2(str,ans+Character.toUpperCase(ch)+str.substring(pos+1),pos+1);
		}
		else if (ch >= 'A' && ch <= 'Z') {
			quiz2(str, ans+Character.toLowerCase(ch)+str.substring(pos+1),pos+1);
		}
		else {
			quiz2(str, ans+ch,pos+1);
		}
	}
}
