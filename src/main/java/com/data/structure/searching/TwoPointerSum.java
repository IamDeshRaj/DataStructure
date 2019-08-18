package com.data.structure.searching;

public class TwoPointerSum {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int sum = 50; int l = 0; int h = arr.length-1; int calSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(l==h) {
				break;
			}
			calSum=arr[l]+arr[h];
			if(calSum==sum) {
				String str = String.format("Sum found with indexes %s and %s with values like %s and %s", l, h, arr[l], arr[h]);
				System.out.println(str);
				break;
			}
			if(arr[l] > arr[h]) {
				l++;
			}else {
				h--;
			}
		}
	}
}
