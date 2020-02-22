package time_complexity;

import java.util.Scanner;

public class power_less_complexity {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int ans=0;
	power(n,m, ans);
}
public static int power(int n,int pow,int ans) {
	if(pow==1) {
		ans= (int)Math.pow(n,pow);
		return ans;
	}
	
	if(pow%2==0) {
		power(n,pow/2,ans);
	}
	if(pow%2!=0) {
		power(n,pow/2+1,ans);
	}
	return ans;
}
}
