package import_oops;

public class dynamic_stack_client {

	public static void main(String[] args) throws Exception {
//		satck_override s1 = new satck_override();
//		satck_override s2 = new satck_override();
//		s1.push(10);
//		s1.push(20);
//		s1.push(30);
//		s1.push(40);
//		s1.push(50);
//		s1.push(60);
//		s1.push(70);
//		s1.display();
////		reverse(s1);
//		actual_reverse(s1, s2, 0);
//		s1.display();
		int[] arr = { 50, 30, 10, 35, 70, 20, 5, 25, 30, 3 };
//		next_greater(arr);
		stock_span(arr);
	}
	public static void reverse(satck_override s1) throws Exception {
		if (s1.empty()) {
			return;
		}
		int ans = s1.pop();
		reverse(s1);
		System.out.print(ans + " ");
		s1.push(ans);
	}
	public static void actual_reverse(satck_override s1, satck_override s2, int pos) throws Exception {
		if (s1.empty()) {
			if (s2.empty())
				return;
			int temp = s2.pop();
			actual_reverse(s1, s2, pos);
			s1.push(temp);
			return;
		}
		int ans = s1.pop();
		s2.push(ans);
		actual_reverse(s1, s2, pos);
	}
	public static void next_greater(int[] arr) throws Exception {

		satck_override s3 = new satck_override();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!s3.empty() && arr[s3.peak()] < arr[i]) {
				ans[s3.pop()] = arr[i];
			}
			s3.push(i);
		}
		while (!s3.empty()) {
			ans[s3.pop()] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " --> " + ans[i]);
		}
	}
	public static void stock_span(int[] arr) throws Exception {
		satck_override s = new satck_override();
		int[] ans=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!s.empty() && arr[s.peak()]<arr[i]) {
			 s.pop();
			}
			if (s.empty()) {
				ans[i]=i+1;
				
			} else {
				ans[i]=i-s.peak();
			}
			s.push(i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
