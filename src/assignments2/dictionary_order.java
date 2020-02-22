package assignments2;

import java.util.Scanner;

public class dictionary_order {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		order(str, "",str);
	}
	public static void order(String str, String ans,String original) {
		if (str.length() == 0) {
			if(check(original,ans)){
			System.out.println(ans);
			}
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String roq = str.substring(0, i) + str.substring(i + 1);
			for (int j = 0; j < i; j++) 
				if (str.charAt(j) == str.charAt(i)) {
					return;
				}
				order(roq, ans + ch,original);
		}
	}
	public static boolean check(String original, String ans) {
		int i=0;
		int j=0;
		while( i<original.length()) {
			while( j<ans.length()) {
				if(ans.charAt(j)>original.charAt(i)) {
					return true;
				}
				else if(ans.charAt(j)==original.charAt(i)) {
				j++;
				i++;
				}
				else if(ans.charAt(j)<original.charAt(i))
					return false;
			}
		}
		return false;	
	}
}
