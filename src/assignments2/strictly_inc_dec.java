package assignments2;

import java.util.Scanner;

public class strictly_inc_dec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int num1=scn.nextInt();
		int i=1,inc=0;
		boolean bl=true;
		for(i=2;i<=n;i++) {
			int num=scn.nextInt();
			if(bl && num1>num) {
				
			}
			else if(num1<num) {
				bl=false;
			}
			else if(bl==false && num1>=num) {
				inc=1;
				break;
			}
			else if(num1==num){
				inc=1;
				break;
			}
			num1=num;	
		}
		if(inc==1)
			System.out.println("false");
		else
			System.out.println("true");	
		
}
}