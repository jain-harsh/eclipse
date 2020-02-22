package recursion;

public class palindrone_partition {
public static void main(String[] args) {
	palindrone_partition("naman","");
}
public static boolean ispalindrone(String str) {
	int left=0;
	int right=str.length()-1;
	while(left<right) {
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}
public static void palindrone_partition(String str,String ans) {
	
	if(str.length()==0) {
		System.out.println(ans);
		return;
	}
	
	
	for(int i=1;i<=str.length();i++) {
		String roq=str.substring(i);
		String ans1=str.substring(0,i);
		if(ispalindrone(ans1)) {
			palindrone_partition(roq,ans+ans1+" ");
		}
	}
}
}
