package com.data.structure.searching;

public class LeftMostElement {

	public static void main(String[] args) {
		//int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int[] arr = {10, 20, 20, 30, 30, 30, 30};
		int l = 0, h = arr.length-1;
		int search = 30;
		int idx = search(arr, l, h, search);
		if(idx != -1) {
			System.out.println(search + " found at index " + idx);
		}else {
			System.out.println(search + " not Found in the arr");
		}
	}

	private static int search(int[] arr, int l, int h, int search) {
		int leftIndex = 0;
		int mid = (l + (h-l)/2);
		for (int i = 0; i < arr.length; i++) {
			if(arr[mid] == search && (mid == 0 || arr[mid-1] != search)) {
				return mid;
			}
			if(arr[mid] > search){
				h = mid;
			}
			if(arr[mid] < search){
				l = mid;
			}
			mid = (l + (h-l)/2);
		}
		return leftIndex;
	}
}
