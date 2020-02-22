package hashing;

import java.util.HashMap;

public class intersection {
	public static void main(String[] args) {
		HashMap<Integer, Integer> val = new HashMap<>();
		HashMap<Integer, Integer> val1 = new HashMap<>();

		int[] arr1 = { 10, 20, 30, 40, 50,70,10 };
		int[] arr2 = { 10, 20, 30 ,10,10,70};

		for (int i = 0; i < arr1.length; i++) {
			if(!val.containsKey(arr1[i]))
			val.put(arr1[i], 1);
			else
				val.put(arr1[i], val.get(arr1[i])+1);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (val.containsKey(arr2[i])) {
				val1.put(arr2[i], val.get(arr2[i]) + 1);
			}

		}
		System.out.println(val1);
		
		

	}
}
