package binary_tree;

public class bst_client {
public static void main(String[] args) {
	int[] in= {10};
	bst bt=new bst(in);
	bt.display();
//	System.out.println(bt.size());
//	System.out.println(bt.height());
//	System.out.println(bt.max());
//	System.out.println(bt.find(100));
//	bt.print_range(10, 240);
//	bt.replace_large_sum();
//	bt.add(70);
//	bt.add(80);
//	bt.addreturn(70);
	
	bt.remove(10);
	bt.display();
}
// 100 true 50 true 5  false false true 75 false false true 200 true 150 false false true 262 false false
}
