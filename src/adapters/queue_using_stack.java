package adapters;//deque efficient

import import_oops.satck_override;

public class queue_using_stack {

	satck_override primary = new satck_override();

	public void enqueue_efficient(int item) throws Exception {
		satck_override helper = new satck_override();

		while (!primary.empty()) {
			helper.push(primary.pop());
		}
		helper.push(item);

		while (!helper.empty()) {
			primary.push(helper.pop());
		}
	}

	public void dequeue_efficient() throws Exception {
		satck_override helper = new satck_override();
		primary.pop();
	}

	public void display() {
		primary.display();
	}
}
