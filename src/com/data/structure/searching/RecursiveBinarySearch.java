package com.data.structure.searching;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int l = 0, h = arr.length-1;
		int search = 30;
		int idx = search(arr, l, h, search);
		if(idx != -1) {
			System.out.println(search+" found at index "+idx);
		}else {
			System.out.println(search+ " not Found in the arr");
		}
	}

	private static int search(int[] arr, int l, int h, int search) {
		if(l>h){
			return -1;
		}

		if(arr[l] == search) {
			return l;
		}else if(arr[h] == search) {
			return h;
		}
		
		int mid = (l + (h-l)/2);
		if(arr[mid] == search) {
			return mid;
		}
		if(arr[mid] > search) {
			return search(arr, l, mid, search);
		}else {
			return search(arr, mid, h, search);
		}
	}
}
