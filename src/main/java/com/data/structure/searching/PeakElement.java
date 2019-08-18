package com.data.structure.searching;

public class PeakElement {

	public static void main(String[] args) {
		int arr[] = {40, 60, 0, 10, 70, 30};
		int peak = searchPeak(arr);
		if(peak != -1) {
			System.out.println("Peak is " + peak);
		}else {
			System.out.println("Peak not Found in the arr");
		}
	}

	private static int searchPeak(int[] arr) {
		int l = 0;  int h = arr.length;  int m = l+(h-l)/2;
		for (int i = 0; i < arr.length; i++) {
			if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) {
				return arr[m];
			}
			if(arr[m] < arr[m+1]) {
				h = m;
			}else if(arr[m] < arr[m-1]) {
				l = m;
			}
			m = l+(h-l)/2;
		}
		return -1;
	}
}
