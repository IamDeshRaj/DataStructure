package com.data.structure.array.v1;

public class WindowSum {

	public static void main(String[] args) {
		int[] arr = {2, 4, 9, 2, 8, 3, 6};
		calculateWindowSum(arr, 3);
	}

	private static void calculateWindowSum(int[] arr, int window) {
		int hightestSum = 0, localSum = 0;
		//int[] hightestWin = new int[3];
		//int[] localWin = new int[3];
		for (int i = 0; i < arr.length-window+1; i++) {
			localSum = 0;
			System.out.print("Window::"+(i+1)+"-->");
			for (int j = 0; j < window; j++) {
				System.out.print(arr[i+j]+"+");
				localSum+=arr[i+j];
			}
			System.out.println("="+localSum);
			if(localSum > hightestSum) {
				hightestSum = localSum;
				//hightestWin = localWin;
			}
		}
		System.out.println(hightestSum);
		//System.out.println(hightestWin);
	}
}
