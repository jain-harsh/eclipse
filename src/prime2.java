import java.util.Scanner;

public class prime2 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int i=2,count=2,prime=0;
	while(count<=n) {
		while(i<count) {
			if(count%i==0) {
				prime=1;
				System.out.println(count);
				break;
			}
			i++;			
		}
		if(prime==0)
			System.out.println(count);
		i=2;
		count++;
		prime=0;
	}
}
}
