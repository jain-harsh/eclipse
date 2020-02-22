package assignments;

import java.util.Scanner;

public class far_to_celcious {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int maxf =scn.nextInt();
	int minf=scn.nextInt();
	int step= scn.nextInt();
	 int temp=minf;
	while(temp<=maxf) {
		System.out.print(temp+" ");
		int c= (int)((5.0/9)*(temp-32));
		temp=temp+step;
		System.out.println(c);
	}
	
}
}
