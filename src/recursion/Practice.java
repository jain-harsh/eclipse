package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
//	pd(5);
//	pdi_skip(5);
//	System.out.println(dice("10",0));
//	getSS("abc");
//	String str="abc";
//	System.out.println(str.substring(0,1));
//	System.out.println(str.substring(0,0));
	int n = scn.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scn.nextInt();
	}
	String str="";
	for(int i=0;i<arr.length;i++) {
		 str=add(str+arr[i]);
	}
	System.out.println(str);
	
}
public static String add(String str) {
	return str;
}
//public static char string(int ch) 
//	int ans=ch+96;
//	return (char)ans;
//}
public static void pd(int n) {
	if(n==0)
		return ;
	
	
	System.out.println(n);
	pd(n-1);
	System.out.println(n);
}
public static void pdi_skip(int n) {
	if(n<=0)
		return;
	
	if(n%2!=0 ) {
		System.out.println(n);
	}
	pdi_skip(n-1);
	if(n%2==0) {
	System.out.println(n);
	}
	
}
//public static ArrayList<String> dice(String str,int sum){
//	if(sum==10) {
//		ArrayList<String> br = new ArrayList<>();
//		br.add("");
//		return br;
//	}
////	char ch=str.charAt(0);
////	String roq=str.substring(1);
////	ArrayList<String> rr = dice(roq,sum+ch);
////
////	ArrayList<String> mr = new ArrayList<>();
//	for(int i=1;i<=6;i++) {
//		int ch=i;
//		ArrayList<String> rr = dice(""+i,sum+ch);
//		ArrayList<String> mr = new ArrayList<>();
//		for (String val : rr) { 
//			mr.add(str.charAt(i) + val);
//	}
//		return mr;
//}
//	
//}
}



