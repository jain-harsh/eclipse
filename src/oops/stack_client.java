package oops;
import import_oops.satck_override;
public class stack_client {
	public static void main(String[] args) throws Exception {
		stack_using_array s=new stack_using_array();
		satck_override s1=new satck_override();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(50);
		
		System.out.println(s.full());
		
		s1.display();
		
//		s.push(60);
		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
////		System.out.println(s.pop());
//		
//		System.out.println(s.empty());
//		
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		s.push(50);
//		
//		s.display();
	}
	 
}
