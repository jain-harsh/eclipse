package segment_trees;

public class client {
public static void main(String[] args) {
	int[] arr= {2,8,9,10,6,5,4};
	segment st=new segment(arr,new stproduct());
//	st.display();
	System.out.println(st.query(2, 5));
//	st.update(4, 16);
//	st.display();
	
	
}
}
