package assignments3;

import java.util.Scanner;

public class histogram {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++)
		    arr[i] = s.nextInt();
		    
		histogram mainobj = new histogram();
    		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    		System.out.println(hist(arr, stack));
		}
	

	public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {
	    int[]ans=new int[arr.length];
	    for(int i=0;i<arr.length;i++) {
	    	
	    	int x=i;
	    	while(x>=0) {
	    		if(arr[i]<=arr[x])
	    			x--;
	    		else {
	    			stack.push(x+1);
	    			break;
	    		}
	    		if(x<0)
	    			stack.push(0);
	    	}
	    	int y=i;
	    	while(y<arr.length) {
	    		if(arr[i]<=arr[y]) {
	    			y++;
	    		}else {
	    			stack.push(y-1);
	    			break;
	    		}
	    		if(y==arr.length)
	    			stack.push(y-1);
	    	}
	    	
	    	int max=stack.pop();
	    	int min=stack.pop();
	    	ans[i]=(max-min+1)*arr[i];
	    	while(!stack.isEmpty()) {
	    		stack.pop();
	    	}
	    }

//	    StacksUsingArrays s2=new StacksUsingArrays();
//	    int j=i+1;
//	    while(arr[i]<=arr[j]) {
//	    	s2.push(j);
//	    	j++;
//	    }
//	    ans[i]=(s2.top()-stack.top()+1)*arr[i];
//	    stack.push(i);
//	}
	    int max=0;
	    for(int i=0;i<ans.length;i++) {
	    	if(ans[i]>max)
	    		max=ans[i];
	    }
	    return max;
	    
	}
	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}
	}

