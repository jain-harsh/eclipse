package dynamic_processing;

public class rod_sell {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 15, 2, 3, 1 };
		System.out.println(rod(arr, arr.length - 1));
		System.out.println(rodTD(arr, arr.length - 1, new int[arr.length]));
		System.out.println(rodBU(arr));
	}

	private static int rod(int[] arr, int len) {

		int left = 1;
		int right = len - 1;
		int max = arr[len];
		while (left <= right) {

			int l = rod(arr, left);
			int r = rod(arr, right);

			int total = l + r;
			if (total > max) {
				max = total;
			}
			left++;
			right--;
		}
		return max;
	}

	private static int rodTD(int[] arr, int len, int[] strg) {

		int left = 1;
		int right = len - 1;
		int max = arr[len];
		if (strg[len] != 0) {
			return strg[len];
		}
		while (left <= right) {

			int l = rodTD(arr, left, strg);
			int r = rodTD(arr, right, strg);

			int total = l + r;
			if (total > max) {
				max = total;
			}
			left++;
			right--;
			strg[len] = max;
		}
		return max;
	}

	public static int rodBU(int[] arr) {
		int[] strg = new int[arr.length];
		for (int len = 0; len < arr.length; len++) {
			int left = 1;
			int right = len - 1;
			int max = arr[len];
			
			while (left <= right) {

				int l = strg[left];
				int r = strg[right];

				int total = l + r;
				if (total > max) {
					max = total;
				}
				left++;
				right--;
				
			}
			strg[len] = max;
		}
		return strg[arr.length - 1];
	}
}