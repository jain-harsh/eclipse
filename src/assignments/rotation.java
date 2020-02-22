package assignments;

import java.util.Scanner;

public class rotation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = scn.nextInt();
		int rem = 0, i = 1, no = -1, naya = n;
		while (naya != 0) {

			naya = naya / 10;
			no++;
		}
		int multi = (int) Math.pow(10, no);
		
		count=count%(no+1);
		if(count<0) {
	
			count=count+(no+1);
		}
		while (i <= count) {
		
			rem = n % 10;
			n = n / 10;
			n = rem * multi + n;
			i++;

		}
	
		System.out.println(n);
	}
	
}
