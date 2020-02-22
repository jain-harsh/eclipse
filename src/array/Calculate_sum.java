package array;

import java.util.Scanner;

public class Calculate_sum {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int N=scn.nextInt();
		int[]arr=new int[N];
		int[]arr2=new int[N];
		int len=arr.length-1,pos=0;
		for(int i=0;i<=len;i++) {
			arr[i] = scn.nextInt();
		}
		int Q=scn.nextInt();
		if(Q>0) {
		for(int i=0;i<Q;i++) {
			int X=scn.nextInt();
			if(X>=0&& X<N) {
			for(int j=0;j<=len;j++) {
				 pos=j-X;
				if(pos<0)
					pos=N+pos;
				
				arr2[j]=arr[j]+arr[pos];	
			}}
			for(int j=0;j<=len;j++) {
				arr[j]=arr2[j];
			}
			pos=0;
		}
		}
		else {
			for(int j=0;j<=len;j++) {
				arr2[j]=arr[j];
			}
		}
		int sum=0;
		for(int j=0;j<=len;j++) {
			sum=sum+arr2[j];
		}
		int ans=sum%((int)Math.pow(10,9)+7);	
	System.out.println(ans);
	}

}
