package assignments;

import java.util.Scanner;

public class single_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0;
		while(sum>-1) {
			int n=scn.nextInt();
			sum=sum+n;
			if(sum>=0)
			System.out.println(n);
			
			
		}	
	}
}
