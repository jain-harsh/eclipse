package heap;

import java.util.ArrayList;

public class genericheap<T extends Comparable<T>> {
	ArrayList<T> heap = new ArrayList<>();

	public int size() {
		return heap.size();
	}

	public boolean isempty() {
		return heap.size() == 0;
	}

	public void display() {
		System.out.println(heap);
	}

	public void add(T item) {
		heap.add(item);
		upheapify(heap.size() - 1);

	}

	private void upheapify(int ci) {
		int i = ci;
		int pi = (ci - 1) / 2;
		if (heap.get(i).compareTo(heap.get(pi)) > 0) {
			swap(i, pi);
			upheapify(pi);
		}
	}

	private void swap(int ci, int pi) {
		T temp = heap.get(ci);
		heap.set(ci, heap.get(pi));
		heap.set(pi, temp);
	}

	public T remove() {
		swap(0, heap.size() - 1);
		T val = heap.remove(heap.size() - 1);
		downheapify(0);
		return val;
	}

	private void downheapify(int i) {
		int mini = i;
		int ci1 = 2 * i + 1;
		int ci2 = 2 * i + 2;
		if (ci1 < heap.size() && heap.get(ci1).compareTo(heap.get(mini)) > 0) {
			mini = ci1;
		}
		if (ci2 < heap.size() && heap.get(ci2).compareTo(heap.get(mini)) > 0) {
			mini = ci2;
		}
		if (mini != i) {
			swap(mini, i);
			downheapify(mini);
		}

	}
}
