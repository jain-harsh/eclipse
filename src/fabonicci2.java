import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class fabonicci2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0,b=1,sum=0;
		System.out.println(a);
	
		while(sum<=n) {
			sum=a+b;
			if(sum<=n) {
				System.out.println(sum);
			    b=a;
			    a=sum;
			}
			    else
			    	break;
		}
	}

}
