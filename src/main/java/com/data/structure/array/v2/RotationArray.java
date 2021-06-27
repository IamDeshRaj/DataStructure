package com.data.structure.array.v2;

import java.util.ArrayList;
import java.util.List;

public class RotationArray {
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		rotate(4, arr);
		arr.forEach(el -> System.out.print(el + ", "));
	}

	private static void rotate(int d, List<Integer> arr) {

		List<Integer> arrSub = new ArrayList<Integer>(arr.subList(0, d));
		int size = arr.size();
		for (int j = d; j < size; j++) {
			arr.add(j - d, arr.remove(j));
		}
	}
}
