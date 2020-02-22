package assignments;

import java.util.Scanner;

public class inverse2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans=0,count=1,rem=0;
		while(n!=0) {
			rem=n%10;
			ans=ans+count*(int) Math.pow( 10, rem-1);
			n=n/10;
			count++;
		}
		System.out.println(ans);
	}

}
