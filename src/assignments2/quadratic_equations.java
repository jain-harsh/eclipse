package assignments2;

import java.util.Scanner;

public class quadratic_equations {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		if(a>=-100 && c<=100) {
		 int root1=0,root2=0;
		 int d=b*b-4*a*c;
		 root1=(-b+ (int) Math.sqrt(d))/2*a;
		 root2=(-b- (int) Math.sqrt(d))/2*a;
		 if(d<0) {
			 System.out.println("imaginary");
			 }
		 else {
			 if(root1 == root2) {
				 System.out.println("real and equal");
				 System.out.print(root1+ " ");
				 System.out.print(root2+ " ");
			 }
			 else if(root1 != root2) {
				 System.out.println("real and distinct");
				 System.out.print(root1 + " ");
				 System.out.print(root2 + " ");
			 } 
		 }}	
}
}
