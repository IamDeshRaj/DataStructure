package com.data.structure.sorting.v1;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5, 3, 2, 6, 9, 7, 8};
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
		arr = sorted(arr);
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

	private static int[] sorted(int[] arr) {
		int key = 0; int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			for (j = i-1; j>=0 && arr[j]>key; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		return arr;
	}
}
