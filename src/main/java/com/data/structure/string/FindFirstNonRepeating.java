package com.data.structure.string;

public class FindFirstNonRepeating {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int arr[] = new int[256];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)] == -1) {
				arr[str.charAt(i)] = 0;
			}else {
				arr[str.charAt(i)]++;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)] == 0) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
