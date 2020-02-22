package import_oops;

import oops.queue_using_array;

public class queue_override extends queue_using_array {

	public void enqueue(int item) throws Exception {
		if (isfull()) {
			int[] arr = new int[2 * data.length];

			for (int i = 0; i < size(); i++) {
				int idx = (i + f) % data.length;
				arr[i] = data[idx];
			}
			data=arr;
			f=0;
		}
		super.enqueue(item);
	}

}
