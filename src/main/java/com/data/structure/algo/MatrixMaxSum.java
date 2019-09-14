package com.data.structure.algo;

public class MatrixMaxSum {

	public static void main(String[] args) {
		
	}
	
	static int hourglassSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = 0; j < arr[0].length-2; j++) {
				int localSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				if(localSum>maxSum) {
					maxSum = localSum;
				}
			}
		}
		return maxSum;
    }
}
