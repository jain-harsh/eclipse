package assignments;

import java.util.Scanner;

public class lcm {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int i=2,lcm=1,larger=1;
		if(n1>n2) {
			larger=n1;
		}
		else {
			larger=n2;
		}
		while(i<=larger) {
			if(n1%i==0 && n2%i==0) {
				n1=n1/i;
				n2=n2/i;
				lcm=lcm*i;
				
			}
		
				else if(n1%i==0) {
				n1=n1/i;
			    lcm=lcm*i;
				}
			    
			    else if(n2%i==0) {
				n2=n2/i;
				lcm=lcm*i;
			    }
			    else
			    	i++;
		}
		System.out.println(lcm);
	}

}
