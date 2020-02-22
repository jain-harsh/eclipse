package heap;

import java.util.ArrayList;

import generics.car;

public class heapgeneric_client {

	public static void main(String[] args) {
//		genericheap<car> heap = new genericheap<>();
//		car[] car = new car[5];
//		car[0] = new car(300, "red", 30000);
//		car[1] = new car(400, "yellow", 30000);
//		car[2] = new car(500, "grey", 30000);
//		car[3] = new car(500, "blue", 30000);
//		car[4] = new car(600, "white", 30000);
//
//		for (int i = 0; i < car.length; i++) {
//			heap.add(car[i]);
//		}
//		while (!heap.isempty()) {
//			System.out.println(heap.remove());
//		}

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.get(0).add(1);
		lists.get(0).add(8);
		lists.get(0).add(9);
		lists.get(0).add(10);
		lists.get(0).add(12);
		lists.get(1).add(5);
		lists.get(1).add(15);
		lists.get(1).add(20);
		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(25);
		lists.get(2).add(30);
		lists.get(3).add(2);
		lists.get(3).add(3);

//	int[] arr= {20,50,30,40,5,4,45};
//	klargest(arr,3);
		merge(lists);
	}

	public static void klargest(int[] arr, int k) {
		Heap heap = new Heap();
		for (int i = 0; i < k; i++) {
			heap.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {

			int val = heap.remove();
			if (val < arr[i]) {
				heap.add(arr[i]);
			} else {
				heap.add(val);
			}
		}
		while (!heap.isempty()) {
			System.out.println(heap.remove());
		}

	}

	public static  class pair implements Comparable<pair> {
		int data;
		int left;
		int idx;
		
//		public pair(int data,int left,int idx){
//			this.data=data;
//			this.left=left;
//			this.idx=idx;
//			
//		}
		@Override
		public int compareTo(pair o) {
			return o.data-this.data;
		}
	}
	public static void merge(ArrayList<ArrayList<Integer>>lists){
		genericheap<pair> heap = new genericheap<>();
		ArrayList<Integer> ans=new ArrayList<>();
 		for(int i=0;i<lists.size();i++) {
		pair np=new pair();
		np.data=lists.get(i).get(0);
		np.left=i;
		np.idx=0;		
		heap.add(np);
		}
		while(!heap.isempty()) {
			pair rp=heap.remove();
			ans.add(rp.data);
			rp.idx++;
			if(rp.idx<lists.get(rp.left).size()) {
				rp.data=lists.get(rp.left).get(rp.idx);
				heap.add(rp);
			}
		}
		System.out.println(ans);
		
	}

}
