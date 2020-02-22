package assignments2;

import java.util.Scanner;

public class pascal_triangle {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	int[]arr=new int[n]; 
	int row=1,nst=1,temp1=0,temp2=0,flag=0;
	arr[0]=1;
//	arr[1]=2;
	while(row<=n) {
		int cst=1;
		arr[nst-1]=1;
		while(cst<=nst) {
			System.out.print(arr[cst-1]+"  ");
			temp1=arr[cst-1];
			 if(cst!=1) {
				 if(flag==0) {
				 arr[cst-1]=temp1+arr[cst-2];
				 flag=1;
				 } 
				 else if(flag==1) {
			 arr[cst-1]=temp2+arr[cst-1];
			 	
				 }}
			temp2=temp1;
			cst++;
			arr[0]=1;
		}
		flag=0;
		row++;
		nst++;
		System.out.println();
	
}
}
}