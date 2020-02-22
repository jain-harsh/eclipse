package recursion;

import java.util.Scanner;

public class binary_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=1;i<=t;i++) {
		String str = scn.next();
		int pos = 0;
		wild_card(str, pos);
	}}

	public static void wild_card(String str,int pos) {
//		if (str.length() == pos+1) {
//			System.out.println(str);
//			return;
//		}
		if (str.length() == pos) {
			System.out.print(str+" ");
			return;
		}
		for (int i = pos; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '?') {
				String roq = str.substring(0, i) + "0" + str.substring(i+1);
				wild_card(roq,i+1);
				roq = str.substring(0, i) + "1" + str.substring(i+1);
				wild_card(roq,i+1);
				return;
			}
			if(i==str.length()-1) {
				System.out.print(str+" ");
			}
		}
	}
}
