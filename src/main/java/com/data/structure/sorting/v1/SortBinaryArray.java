package com.data.structure.sorting.v1;

public class SortBinaryArray {

	public static void main(String[] args) {
		//int[] arr = {1, 0, 0, 1, 0, 1, 0};
		int[] arr = {0, 1, 0, 1, 0, 1, 0};
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[idx] == 0 && arr[i] == 1) {
				idx = i;
				continue;
			}
			if(arr[idx] != arr[i]) {
				arr[i] = 1;
				arr[idx] = 0;
				idx++;
			}
		}
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
		/*while(i < a.length) {
			if(a[i] == 0 && i < idx) {
				a[i] = 1;
				a[idx] = 0;
				idx++;
			}else if(a[i] == 1 && a[idx] != 1) {
				idx = i;
			}
			i++;
		}*/
	}
}
