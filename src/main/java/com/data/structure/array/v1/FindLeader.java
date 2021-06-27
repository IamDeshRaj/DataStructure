package com.data.structure.array.v1;

public class FindLeader {

	public static void main(String[] args) {

		int[] arr = {2,4, 5, 9, 6, 8, 3};
		int max = arr[arr.length-1];
		for (int i = arr.length-1; i > -1; i--) {
			if(arr[i] >= max) {
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
	/*public static void main(String[] args) {
		int[] arr = {2,4, 5, 9, 6, 8, 3};
		boolean isLeader = false;
		for (int i = 0; i < arr.length; i++) {
			isLeader = true;
			for (int j = 0; j < arr.length; j++) {
				if(j>i   && arr[i]<arr[j]) {
					isLeader = false;
				}
				if(!isLeader) {
					break;	
				}
			}
			if(isLeader) {
				System.out.print(arr[i]+" ");
			}
		}
	}*/
}
