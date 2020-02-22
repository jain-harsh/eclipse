package import_oops;

import oops.stack_using_array;

public class satck_override extends stack_using_array {

	public void push(int item) throws Exception {
		if (full()) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				arr[i] = data[i];
			}
			data = arr;

		}
		super.push(item);

	}
	

}
