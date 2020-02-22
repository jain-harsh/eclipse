import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		
			System.out.println("enter value");
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			while(n!=0){
			int rem= n%10;
			n=n/10;
			int b=0;
			b=b*10+rem;
			System.out.print(rem);
		 	
		}
	}

}
