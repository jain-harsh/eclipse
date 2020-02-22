import java.util.Scanner;

public class fabonicci { 
	public static void main(String[] args) {
				Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=0;	
		int b=1;
		System.out.println(a);
		int i=1;
		while(i<=n/2) {
					System.out.println(b);
		a=a+b;
		System.out.println(a);
		b = a+b;
		i=i+1;
	}
	}

}
