package string;

import java.util.Scanner;

public class string_diff_ascii {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int count=1;
	String str=scn.next();
	StringBuilder sb= new StringBuilder(str);
	for(int i=0;i<str.length()-1;i++) {
		int a=str.charAt(i+1)-str.charAt(i);
		
		sb.insert(i+count,a);	
		count++;
		if(a/10!=0)
			count++;
		if(a<0)
			count++;
	}
	System.out.println(sb);
	
}
}
