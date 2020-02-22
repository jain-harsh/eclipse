package assignments2;

import java.util.Scanner;

public class maze_path {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt(); 
	maze(0,0,n,m,"");
	System.out.println();
	System.out.print(count);
} 
static int count=0; 
public static void maze(int r,int c,int endr,int endc,String str) {
	
	
	if(r==endr-1 &&c==endc-1) {
		count=count+1;
		System.out.print(str+" ");
		return;
	}
	
	if(r>endr || c>endc) {
		return;
	}
	maze(r, c+1, endr, endc, str+"H");
	maze(r+1, c, endr, endc, str+"V");
	maze(r+1, c+1, endr, endc, str+"D");
}
}
