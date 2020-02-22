package functions;

import java.util.Scanner;

public class print_series {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int N1=scn.nextInt();
	int N2=scn.nextInt();
	print_series(N1,N2);
}
public static void print_series(int N1,int N2) {
	int i=1,n=0,count=1;
	while(count<=N1) {
		n=3*i+2;
		if(n % N2!= 0) {
			System.out.println(n);
			count++;
		}i++;
	}
}
}
