package import_oops;

public class dynamic_queue {

	public static void main(String[] args) throws Exception {
		
		queue_override q= new queue_override();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		q.display();
		actual_reverse(q);
		q.display();
		display_reverse(q, 0);
		System.out.println();
		q.display();
		
	}
	public static void display_reverse(queue_override q,int count) throws Exception{
		if (count == q.size()) {
			return;
		}
		
		int temp = q.dequeue() ;
		q.enqueue(temp);
		
		display_reverse(q, count+1);
		
		System.out.print(temp+" ");
		
	}
	public static void actual_reverse(queue_override q) throws Exception{
		if(q.isempty()) {
			return;
		}
		
		int item=q.dequeue();
		System.out.print(item+"-");
		actual_reverse(q);
		System.out.print(item+"-");
		q.enqueue(item);
	}
}
