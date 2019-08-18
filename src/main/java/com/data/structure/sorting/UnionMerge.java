package com.data.structure.sorting;

public class UnionMerge {

	public static void main(String[] args) {
		int left[] = {2, 4, 6, 8};
		int right[] = {1, 3, 5, 7};
		int arr[] = new int[left.length + right.length];
		merge(arr, left, right);
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int leftIdx = 0; int rightIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if(leftIdx==left.length && rightIdx<right.length) {
				arr[i] = right[rightIdx];
				rightIdx++;
			}else if(leftIdx<left.length && rightIdx==right.length) {
				arr[i] = left[leftIdx];
				leftIdx++;
			}else if(left[leftIdx] > right[rightIdx]) {
				arr[i] = right[rightIdx];
				rightIdx++;
			}else if(left[leftIdx] < right[rightIdx]) {
				arr[i] = left[leftIdx];
				leftIdx++;
			}
		}
	}
}
