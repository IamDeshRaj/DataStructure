package com.data.structure.sorting;

public class QuickSort {

	public static void main(String[] args) {
		//int arr[] = {6, 3, 2, 5, 9, 7, 8};
		//int arr[] = {6, 3, 2, 5, 9, 7, 8};
		int arr[] = {5, 20, 10, 15, 6, 7};
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
		int l=0; int h = arr.length-1;
		quickSort(arr, l, h);
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

	private static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p = partition(arr, l, h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}
	}
	
	//int arr[] = {5, 20, 10, 15, 6, 7};
	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		for (int j = l; j <= h-1; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}
}
