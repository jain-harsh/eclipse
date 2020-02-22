package assignments;

import java.util.Scanner;

public class rough {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t=scn.nextInt();
	int i=1;
	
	while(i<=t) {
	
	
	int mi=scn.nextInt();
	int ni=scn.nextInt();
	i++;
}
	while(i<=t) {
		int count1=-1,count2=0;


	while(count1<=mi && count2<=ni) {
			count1=count1+2;
			count2=count2+2;
		}
		if(count1>mi) {
			System.out.println("harshit");
		}
		else {
			System.out.println("aayush");
		}
		i++;
	
	}
	
}
}