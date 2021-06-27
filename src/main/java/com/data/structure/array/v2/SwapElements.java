package com.data.structure.array.v2;

import java.util.ArrayList;
import java.util.List;

public class SwapElements {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		reverseArray(a);
		System.out.println(a);
	}

	public static void reverseArray(List<Integer> a) {
		int limit = a.size() / 2;
		for (int i = 0; i < limit; i++) {
			int head = a.remove(i);
			int tailIdx = (a.size() - 1) - i;
			int tail = a.remove(tailIdx);
			a.add(i, tail);
			System.out.println("Add "+tail+" at index "+i);
			tailIdx = (a.size()) - i;
			a.add(tailIdx, head);
			System.out.println("Add "+head+" at index "+tailIdx);
		}
	}
}
