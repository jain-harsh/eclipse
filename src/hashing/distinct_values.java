package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class distinct_values {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Character, Integer> val = new HashMap<>();
		String str = scn.next();

		for (int i = 0; i < str.length(); i++) {
			if (!val.containsKey(str.charAt(i))) {
				val.put(str.charAt(i), 1);
			}

			else if (val.containsKey(str.charAt(i))) {
				val.put(str.charAt(i), val.get(str.charAt(i)) + 1);
			}

		}
		System.out.println(val);
	}
}
