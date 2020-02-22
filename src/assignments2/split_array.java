package assignments2;

import java.util.Scanner;

public class split_array {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
//		int[] left = new int[n];
//		int[] right = new int[n];
		
		split(arr, 0,0,0,"","");
//		System.out.println();
		System.out.println(count);
	}
static int count;
	public static void split(int[] arr, int vidx,int suml,int sumr,String ansl,String ansr) {
		
		if(vidx==arr.length ) {
			if(suml==sumr) {
				System.out.println(ansl+"and "+ansr);
				count++;
			}
			
			return;
		}
		
		split(arr, vidx+1,  suml+arr[vidx], sumr, ansl+arr[vidx]+" ",ansr);
		split(arr, vidx+1, suml, sumr+arr[vidx], ansl, ansr+arr[vidx]+" ");
		}	
}


