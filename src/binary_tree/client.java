package binary_tree;

public class client {
	public static void main(String[] args) {

//	bt.display();
//	System.out.println(bt.height());
//	System.out.println(bt.size());
//	System.out.println(bt.max());
//	System.out.println(bt.find(65));
//	System.out.println(bt.diameter1());
//	System.out.println(bt.diameter2());
//	System.out.println(bt.diameter3());
//	System.out.println(bt.is_balanced());
//	System.out.println(bt.is_balanced2());
//	binary bt1=new binary();
//	System.out.println(bt.flip_equiavent(new binary()));
//	bt.preorder();
//	System.out.println(bt.maxtreesum());
//	System.out.println(bt.maxsumtree2());
//	int[] pre= {10,20,40,50,30,60,70,80};
//	int[] in= {20,50,40,10,60,30,70,80};
//	binary b=new binary(pre,in);
//	b.display();
//		int[] pre = { 100, 500, 5, 60, 55, 70, 2000, 150, 300, 250, 400, 350, 500 };
//		int[] in = { 5, 500, 55, 60, 70, 100, 150, 2000, 250, 300, 350, 400, 500 };
//		binary bt = new binary(pre, in);
//		bt.largest_bst();

		int[] pre = { 10, 20, 40, 80, 90, 110, 50, 100, 30, 60, 70, 120, 130 };
		int[] in = { 80, 40, 90, 110, 20, 50, 100, 10, 60, 30, 120, 130, 70 };
		binary b=new binary(pre,in);
		b.verticaldisplay();

	}
}
//10 true 20 true 40 true 80 false false false true 50 false true 90 false false true 30 true 60 false true 100 false false true 70 true 110 false false false
//10 true 20 true 40 false true 50 false false false true 30 false true -60 false false
//10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
//10 true 30 false true 60 false false true 20 true 50 false false true 40 false false
