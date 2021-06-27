package com.data.structure.array.v2;

import java.util.ArrayList;
import java.util.List;

public class DiagonalSum {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(11);
		lst.add(2);
		lst.add(4);
		arr.add(lst);
		lst = new ArrayList<Integer>();
		lst.add(4);
		lst.add(5);
		lst.add(6);
		arr.add(lst);
		lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(8);
		lst.add(-12);
		arr.add(lst);
		System.out.println(diagonalDifference(arr));;
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int firstSum = 0;
		int lastSum = 0;
		int lastIndex = 0;
		for (int i = 0; i < arr.size(); i++) {
			List<Integer> integers = arr.get(i);
			lastIndex = (integers.size() - 1) - i;
			firstSum += integers.get(i);
			lastSum += integers.get(lastIndex);
		}

		System.out.println();
		return Math.abs(firstSum - lastSum);
	}
}
