package string;

import java.util.Scanner;

public class sub_strings {
	 static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
	String str=scn.next();
//	for(int i=0;i<str.length();i++) {
//		System.out.println(str.charAt(i));
//	}
//	substring(str);
//	System.out.println(palindrone(str));
//	boolean bl=palindrone(str);
//	if(bl)
//		System.out.println("true");
//	else
//		System.out.println("false");
//	count_of_palindrone_ss(str);
	substring( str);
}
public static void substring(String str) {
	int i=0,last=str.length(),j=0;
	for(i=0;i<str.length();i++) {
		for(j=i+1;j<=last;j++) {
			System.out.print(str.substring(i, j)+" ");
		}
		System.out.println();
	}
	
}

public static boolean palindrone(String str) {
int i=0,last=str.length(),j=0;
for( i=0,j=last-1;i<last/2;i++,j--) {
	if(str.charAt(i)!=str.charAt(j)) {
		return false;
	}
}
return true;
}	

public static void count_of_palindrone_ss(String str) {
	int count=0;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			boolean bl=palindrone(str.substring(i, j));
			if(bl)
				count++;
		}
		
	}
	System.out.println(count);
}
}











