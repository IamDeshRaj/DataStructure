package com.data.structure.string;

public class FindFirstOccurance {

	public static void main(String[] args) {
		String str = "geeksforgeekaa";
		//int res = Integer.MAX_VALUE;
		int arr[] = new int[256];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)]==-1) {
				arr[str.charAt(i)] = i;
			}else {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
