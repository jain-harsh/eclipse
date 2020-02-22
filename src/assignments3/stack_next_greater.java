package assignments3;

import java.util.Scanner;

public class stack_next_greater {
	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		while(t-- > 0){
    		
    		int N=s.nextInt();
    		int[] nums=new int[N];
    		for(int i=0;i<N;i++){
    			nums[i]=s.nextInt();
    		}
            
    		stack_next_greater obj = new stack_next_greater();
            StacksUsingArrays stack = obj.new StacksUsingArrays();
    		int[] ans=NextGreater(nums, stack);
    		for(int i=0;i<ans.length;i++){
    			System.out.println(nums[i]+","+ans[i]+" ");
    		}
    // 		System.out.println();
		}

	}

	public static int[] NextGreater(int[] nums,StacksUsingArrays stack) throws Exception {
        int[]ans=new int[nums.length];
   for(int i=0;i<nums.length;i++) {
	   int j=i+1;
	  while(j<nums.length) {
		stack.push(nums[j++]);  
	   }
	  int val=-1;
	  while(!stack.isEmpty()) {
		  if(nums[i]<stack.top())
			   val=stack.top();
			  stack.pop();
	  }
	  ans[i]=val;
   }
   return ans;
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
