package assignments2;

public class lexio_counting {
public static void main(String[] args) {
	lexico(0,100);
}
public static void lexico(int curr,int end) {
	if(curr>end)
		return;

	System.out.println(curr);
	
	int i=0;
	if(curr==0)
		i=1;
	for(;i<=9;i++)
		lexico(curr*10+i,end);
}
}
