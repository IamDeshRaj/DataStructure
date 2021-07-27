package com.data.structure.sorting.v1;

public class Practice {

	/*public static void main(String[] args) {
		//int arr[] = {1, 0, 2, 0, 2, 1};
		int arr[] = {3, 1, 4, 2};
		int l = 0; int h = arr.length-1;
		quickSort(arr,l, h);
	}*/

	public static void main(String[] args) {
		int arr[] = {4, 1, 3, 2};
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
		//quickSort(arr, 0, arr.length-1);
		bubbleSort(arr);
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

	private static void bubbleSort(int[] arr) {
		int tmp = 0;
		for (int i = arr.length-1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

	private static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p = partition(arr, l, h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		int tmp = 0;
		for (int j = l; j < h; j++) {
			if(arr[j] < pivot) {
				i++;
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		tmp = arr[i+1];
		arr[i+1] = pivot;
		arr[h] = tmp;
		return i+1;
	}
}
