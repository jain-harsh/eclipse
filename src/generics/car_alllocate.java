package generics;

public class car_alllocate {
	public static void main(String[] args) {
		car[] carr=new car[5];
		carr[0]=new car(300,"red",30000);
		carr[1]=new car(400,"yellow",30000);
		carr[2]=new car(500,"grey",30000);
		carr[3]=new car(500,"blue",30000);
		carr[4]=new car(600,"white",30000);
	
//		display(carr);	
		bubble(carr,5);
		display(carr);
	}
	private static<t> void display(t[] car) {
		for(t val:car) {
			System.out.println(val);
		}
	}	
	public static<t extends Comparable<t>> void bubble(t[] arr, int n) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= n - i - 2; j++) {
				if (arr[j].compareTo(arr[j + 1])>0) {
					t temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
}