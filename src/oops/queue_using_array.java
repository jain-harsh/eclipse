package oops;

public class queue_using_array {

	protected int[] data;
	protected  int f;
	private int s;
	
	public queue_using_array() {
		 data= new int[5];
		f=0;
		 s=0;
	}
	
	public queue_using_array(int cap) {
		 data= new int[cap];
		f=0;
		s=0;
	}
	
	public void enqueue(int item) throws Exception {
	int idx=(f+s)%data.length;
	if(isfull()) {
		throw new Exception("QUEUE FULL");
	}
	data[idx]=item;
	s++;
	}
	public int dequeue() throws Exception {
		if(s==0) {
			throw new Exception("QUEUE EMPTY");
		}
		int temp=data[f];
		f=(f+1)%data.length;
		s--;
		return temp;
	}
	public int get_front() throws Exception {
		if(s==0) {
			throw new Exception("QUEUE EMPTY");
		}
		return f%data.length;
	}
	public int size() {
		return s;
	}
	public boolean isempty() {
		return f==0;
	}
	public boolean isfull() {
		return size()==data.length;
	}
	public void display() {
		System.out.println("----------------");
		for(int i=0;i<s;i++) {
			int temp=(i+f)%data.length;
			System.out.print(data[temp]+" ");
		}
			System.out.println();
			System.out.println("----------------");
		
	}
}
