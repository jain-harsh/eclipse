package assignments2;

import java.util.HashMap;
import java.util.Scanner;

public class parenthesis {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int open = 0, close = 0;
		String ans = "";
		parenthisis(n, open, close, ans);
	}
	
			
	public static void parenthisis(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (close > open || open > n || close > n) {
			return;
		}

		parenthisis(n, open, close + 1, ans + ")");// close
		parenthisis(n, open + 1, close, ans + "(");// open
				
	}
}
