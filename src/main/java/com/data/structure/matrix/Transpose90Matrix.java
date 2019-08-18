package com.data.structure.matrix;

public class Transpose90Matrix {

	public static void main(String[] args) {

		int arr[][] = {{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}};
		printMatrics(arr);
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i][arr.length-1];
			arr[i][arr.length-1] = arr[i][0];
			arr[i][0] = tmp;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i*1; j < arr.length; j++) {
				swap(arr, i, j);
			}
		}
		printMatrics(arr);
	}

	private static void swap(int[][] arr, int i, int j) {
		int tmp = arr[j][i];
		arr[j][i] = arr[i][j];
		arr[i][j] = tmp;
	}

	private static void printMatrics(int[][] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("{");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
				if(j+1<arr.length) {
					System.out.print(", ");
				}
			}
			if(i != arr.length-1) {
				System.out.println("},");
			}
		}
		System.out.println("}}\n");
	}
}
