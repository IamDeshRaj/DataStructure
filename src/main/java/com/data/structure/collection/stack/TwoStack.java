package com.data.structure.collection.stack;

import java.lang.reflect.Array;

public class TwoStack<E>{

	private E[] array = null;
	private int index1 = -1;
	private int index2 = -1;
	private int size1 = 0;
	private int size2 = 0;
	
	public TwoStack(Class<E> c, int size) {
		@SuppressWarnings("unchecked")
		final E[] a = (E[]) Array.newInstance(c, size);
		array = a;
		index1 = -1;
		index2 = size;
	}
	
	public void push1(E element) {
		index1++;
		if(index1 >= index2) {
			index1--;
			System.out.println("Stack is Full");
			return;
		}
		array[index1] = element;
		size1++;
	}
	
	public void push2(E element) {
		index2--;
		if(index2 <= index1) {
			index2++;
			System.out.println("Stack is Full");
			return;
		}
		array[index2] = element;
		size2++;
	}
	
	public E pop1() {
		if(size1 == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		E element = array[index1];
		index1--;
		size1--;
		return element;
	}
	
	public E pop2() {
		if(size2 == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		E element = array[index2];
		index2++;
		size2--;
		return element;
	}

	public int size1() {
		return size1;
	}

	public int size2() {
		return size2;
	}
}
