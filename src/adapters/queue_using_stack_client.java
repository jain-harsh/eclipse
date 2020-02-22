package adapters;

public class queue_using_stack_client {
public static void main(String[] args) throws Exception {
	queue_using_stack q1=new queue_using_stack();
	q1.enqueue_efficient(10);
	q1.enqueue_efficient(20);
	q1.enqueue_efficient(30);
	q1.enqueue_efficient(40);
	q1.enqueue_efficient(50);
	
	q1.display();
	q1.enqueue_efficient(60);
	q1.display();
	
	
}
}
