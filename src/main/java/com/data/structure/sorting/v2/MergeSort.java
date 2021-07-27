package com.data.structure.sorting.v2;

public class MergeSort {

	public static void main(String[] args) {
		int[] i = {-9, 2, 6, -4, 8, 1, 9, 0};
		sort(i, 0, i.length);
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j]+", ");
		}
	}

	private static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (end+start)/2;
			sort(arr, start, mid);
			sort(arr, start, mid);
			
		}
	}

}
