package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class consecutive_sequence {
	public static void main(String[] args) {

		HashMap<Integer, Boolean> val = new HashMap<>();
		ArrayList<Integer> val1 = new ArrayList<>();
		int[] arr = {  2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 4};
		
		for (int i = 0; i < arr.length; i++) {
			if (val.containsKey(arr[i] - 1)) {
				val.put(arr[i],false);
			}
			else {
				val.put(arr[i],true);
			}
			if(val.containsKey(arr[i]+1)) {
				val.put(arr[i]+1,false);
			}
			
		}
	//	System.out.println(val);
		int maxcount=0;
		
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(val.get(arr[i])) {
				
				while(val.containsKey(arr[i]+count)) {
					count++;
				}
			
			}
			if(count>maxcount) {
				maxcount=count;
				ans=arr[i];
			}
			
		}
//		System.out.println(maxcount);
		
		for(int i=0;i<maxcount;i++) {
			System.out.println(ans+i);
		}
	}
}
