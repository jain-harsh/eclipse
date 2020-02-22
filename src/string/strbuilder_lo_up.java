package string;

import java.util.Scanner;

public class strbuilder_lo_up {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
//		StringBuilder sb= new StringBuilder(str);
//		changecase(str);
//		odd_even(str);
//		max_frequency(str);
//		remove_dublicate(str);
		string_compression(str);

	}

	public static void changecase(String str) {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.charAt(i)>='a' &&str.charAt(i)<='z') {
				sb.append(Character.toUpperCase(ch));

			}
			else if(str.charAt(i)>='A' &&str.charAt(i)<='Z') {
				sb.append(Character.toLowerCase(ch));
			}		
		}
		System.out.println(sb);
	}
	public static void odd_even(String str) {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i%2==0) {
				ch++;
				sb.append(ch++);
			}
			else {
				ch--;
				sb.append(ch--);
			}
			}
		System.out.println(sb);
	}
	public static void max_frequency(String str) {
		
		int count=1,large=1;
		char ans=str.charAt(0);
		for(int i=0;i<str.length();i++) {
			char max=str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				if(max==str.charAt(j))
					count++;
			}
				if(count>large) {
					 ans = str.charAt(i);
					 large=count;
				}
			 count=0;
		}
		System.out.println(ans);
		
	}

	public static void remove_dublicate(String str) {
		StringBuilder sb= new StringBuilder();
		char db=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			
			if(db!=str.charAt(i)) {
				sb.append(db);	
			}
			 db=str.charAt(i);
			 if(i==str.length()-1)
				 sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
	public static void string_compression(String str) {
		StringBuilder sb= new StringBuilder();
		char db=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++) {

			if(db!=str.charAt(i) ) {
				sb.append(db);
				if(count!=1)
					sb.append(count);
				count=1;
				db=str.charAt(i);
			}
			else 
				count++;
//			 db=str.charAt(i);
			if(i==str.length()-1) {
				 sb.append(str.charAt(i));
				 if(count!=1)
				 sb.append(count);
			}}
		System.out.println(sb);
	}
}
	
	




	