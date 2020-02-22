package segment_trees;

public class stmax implements segment_tree_I{

	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return Math.max(a,b);
	}

	@Override
	public int defaultvalue() {
		// TODO Auto-generated method stub
		return Integer.MIN_VALUE;
	}

}
