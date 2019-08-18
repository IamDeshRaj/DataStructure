package com.data.structure.matrix;

public class SnakeOrder {

	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}};
		boolean turn = false;
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			turn = false;
			if(i%3==1) {
				turn = true;
			}
			for (int j = 0; j < arr.length; j++) {
				if(turn) {
					System.out.print(arr[i][arr.length-1-j]);
				}else {
					System.out.print(arr[i][j]);
				}
				if(j<arr.length) {
					System.out.print(", ");
				}
			}
		}
		System.out.print("}");
	}
}
