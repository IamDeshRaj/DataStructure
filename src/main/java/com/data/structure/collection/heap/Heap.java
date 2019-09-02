package com.data.structure.collection.heap;

public class Heap{
	int[] arr; // this can be an array list.
	int size, capacity;
	public Heap(int capacity){
		this.arr = new int[capacity];
		this.capacity = capacity;
	}

	public int extractMin() {
		int zeroTh = this.arr[0];
		
		return zeroTh;
	}
	
	public void insert(int element) {
		this.arr[size] = element;
		size++;
		heapify();
	}

	public void dereaseKey(int idx, int value) {
		this.arr[idx] = value;
		size++;
		heapify();
	}

	private void heapify() {
		int i = size-1, parentIdx = parent(i);

		while(i > 0 && this.arr[i] > 0 && this.arr[parentIdx] > this.arr[i]) {
			swap(parentIdx, i);
			i = parent(i);
			parentIdx = parent(i);
		}
	}

	public void printElements() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}

	private void swap(int i, int j) {
		int tmp = this.arr[i];
		this.arr[i] = this.arr[j];
		this.arr[j] = tmp;

	}

	private int parent(int i) {
		return (i-1)/2;
	}
}