package com.data.structure.searching;

public class ElementInInfiniteArr {

	public static void main(String[] args) {
		int arr[] = {2, 5, 7, 9, 11, 15, 17, 18, 23, 25, 28, 30, 31, 34, 36};
		int search = 15 ;
		int idx = search(arr, search);
		if(idx != -1) {
			System.out.println(search + " found at index " + idx);
		}else {
			System.out.println(search + " not Found in the arr");
		}
	}

	private static int search(int[] arr, int search) {
		int l = 0; int h = 0;
		int mid = 1;
		while (l != mid) {
			if(arr[mid] == search) {
				return mid;
			}
			if(arr[mid] > search) {
				h = mid;
			}
			if(arr[mid] < search) {
				l = mid;
				mid = mid*2;
			}
			if(h > l) {
				mid = l+(h-l)/2;
			}
		}
		return -1;
	}
}
