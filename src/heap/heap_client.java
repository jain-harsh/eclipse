package heap;

public class heap_client {
public static void main(String[] args) {
	Heap h=new Heap();
	h.add(30);
	h.add(10);
	h.add(20);
//	h.display();
	h.add(40);
	h.display();
	
	while(!h.isempty()) {
	h.remove();
	h.display();
	}
}
}
