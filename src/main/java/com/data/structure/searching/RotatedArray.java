package com.data.structure.searching;

public class RotatedArray {

	public static void main(String[] args) {
		int arr[] = {40, 50, 60, 10, 20, 30};
		int search = 90;
		int idx = search(arr, search);
		if(idx != -1) {
			System.out.println(search + " found at index " + idx);
		}else {
			System.out.println(search + " not Found in the arr");
		}
	}

	private static int search(int[] arr, int search) {
		int pivot = 0; int l = 0; int h = arr.length; int m = l+(h-l)/2;
		for (int i = 0; i < arr.length; i++) {
			if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) {
				pivot = m;
				break;
			}
			if(arr[0] > arr[m]) {
				h = m;
			}else {
				l = m;
			}
			m = l+(h-l)/2;
		}
		if(arr[pivot] > search && arr[0] < search) {
			h = pivot;
			l = 0;
		}else {
			l = pivot;
			h = arr.length;
		}
		m = l+(h-l)/2;
		
		for (int i = l; i <= new Integer(h); i++) {
			if(l>h) {
				break;
			}
			if(arr[m] == search) {
				return m;
			}
			if(arr[m] > arr[i]) {
				h = m;
			}else {
				l = m;
			}
			m = l+(h-l)/2;
		}
		
		return -1;
	}
}
