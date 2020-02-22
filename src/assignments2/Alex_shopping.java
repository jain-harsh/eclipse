package assignments2;

import java.util.Scanner;

public class Alex_shopping {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int q =scn.nextInt();
		for(int i=1;i<=q;i++) {
			int p=scn.nextInt();
			int k=scn.nextInt();
			if(k<=n) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(p!=0 && p%arr[j]==0) {
					 count++;
				}}
				if(count>=k)
					System.out.println("Yes");
				else
					System.out.println("No");
		}
			
		}
		
	}
}
