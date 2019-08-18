package com.data.structure.searching;

public class IterativeBinarySearch {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int l = 0, h = arr.length-1;
		int search = 80;
		int idx = search(arr, l, h, search);
		if(idx != -1) {
			System.out.println(search + " found at index " + idx);
		}else {
			System.out.println(search + " not Found in the arr");
		}
	}

	private static int search(int[] arr, int l, int h, int search) {
		int mid = (l + (h-l)/2);
		for (int i = 0; i < arr.length; i++) {
			if(arr[mid] == search) {
				return mid;
			}
			if(arr[mid] > search) {
				h = mid;
			}
			if(arr[mid] < search) {
				l = mid;
			}
			mid = (l + (h-l)/2);
		}
		return -1;
	}
}
