package dynamic_processing;

import java.util.Scanner;

public class fabonicci {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	System.out.println(fabonicci(n));
	System.out.println(fabonicciTD(n,new int[n+1]));
	System.out.println(fabonicciBU( n));
	System.out.println(fabonicciBU_space_efficient(n));
	
}
private static int fabonicciBU_space_efficient(int n) {
	int[] arr=new int[2];
	arr[0]=0;
	arr[1]=1;
	int ans=0;
	for(int i=1;i<n;i++) {
		ans=arr[0]+arr[1];
		arr[0]=arr[1];
		arr[1]=ans;
	}
	return ans;
}
private static int fabonicciBU(int n) {
	int[] arr=new int[n+1];
	arr[0]=0;
	arr[1]=1;
	for(int i=2;i<arr.length;i++) {
		arr[i]=arr[i-1]+arr[i-2];
	}
	return arr[n];
}
private static int fabonicciTD(int n, int[] strg) {
	if(n==0 || n==1)
		return n;
	if(strg[n]!=0) {
		return strg[n];
	}
	int fab1=fabonicci(n-1);
	int fab2=fabonicci(n-2);
	int fb=fab1+fab2;
	strg[n]=fb;
	return fb;
}
public static int fabonicci(int n) {
	if(n==0 || n==1)
		return n;
	int fab1=fabonicci(n-1);
	int fab2=fabonicci(n-2);
	int fb=fab1+fab2;
	return fb;
}

}
