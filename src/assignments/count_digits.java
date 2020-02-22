package assignments;

import java.util.Scanner;

public class count_digits {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int digit=scn.nextInt();
		int count=0,rem=0;
		while(n!=0) {
			rem=n%10;
				if(digit==rem)
						count++;
			n=n/10;
		}System.out.println(count);
	}

}
