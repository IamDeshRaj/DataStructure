package com.data.structure.collection.heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Heap heap = new Heap(10);
		heap.insert(12);
		heap.insert(13);
		heap.insert(15);
		heap.insert(16);
		heap.insert(17);
		heap.insert(14);
		heap.insert(18);
		heap.insert(11);
		heap.dereaseKey(2, 11);
		heap.printElements();
	}
}
