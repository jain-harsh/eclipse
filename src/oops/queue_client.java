package oops;

public class queue_client {

	public static void main(String[] args) throws Exception {
		queue_using_array q= new queue_using_array();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(10);
		
		q.display();
		
		System.out.println(q.isempty());
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.display();
		
	}

}
