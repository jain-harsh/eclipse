package recursion;

import java.util.Scanner;

public class pdi_skip {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pdi_skip(n);
	}
	public static void pdi_skip(int n){
		
		if( n<=0)
			return;
		
		if(n%2==0)	{
			System.out.println(n - 1);
			pdi_skip(n - 3);
			System.out.println(n);
		} else {
			System.out.println(n);
			pdi_skip(n - 2);
			System.out.println(n+1);
		}
	}
 
}
