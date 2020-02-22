package recursion;

import java.util.Scanner;

public class fab_pow_fact {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//		int pow = scn.nextInt();
//		int ans=factorial(n);
//		System.out.println(ans);
//		int mul = multiply(n, pow);
//		System.out.println(mul);
		int ans=fabonicci(n);
		System.out.println(ans);
	}

	public static int factorial(int n) {
		if (n == 1)
			return n;

		int fab = factorial(n - 1);
		return fab * n;

	}

	public static int multiply(int n, int pow) {
		if (pow == 1)
			return n;

		int ans = multiply(n, pow - 1);
		return ans * n;
	}
	public static int fabonicci(int n) {
		if(n==0 || n==1)
			return n;
		int fab1=fabonicci(n-1);
		int fab2=fabonicci(n-2);
		int fb=fab1+fab2;
		return fb;
	}
	
	
}
