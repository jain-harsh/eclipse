package generic_trees;

public class generic_client {
public static void main(String[] args) {
		
		// 10 3 20 2 50 0 100 0 30 0 40 2 70 0 80 0
		generic gt = new generic() ;
		gt.display();
//		System.out.println(gt.size());
//		System.out.println(gt.max());
//		System.out.println(gt.find(130));
//		System.out.println(gt.height());
//		gt.mirror();
//		System.out.println("---------------");
//		gt.display();
//		gt.print_level(1);
		System.out.println("=------");
//		gt.linearize();
//		gt.display();
//		gt.preorder();
		gt.level_orderLW1();
//		gt.display();
		gt.levelOrderLW2();
		gt.levelOrderZZ();
	}
}
