package com.data.structure.matrix;

public class SpiralTraversal {

	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		printMatrics(arr);
		int rl = 0; int rh = arr.length-1; int cl = 0; int ch = arr.length-1;
		boolean iR=false; boolean dR=false; boolean iC=false; boolean dC=false;
		int r = 0; int c = 0; int l = arr.length-1;
		do {
			System.out.print(arr[r][c]+", ");
			if(r == 0 && c == 0) {
				iC = true;
				dR = false;
				iR = false;
				dC = false;
			}
			if(r == 0 && c == l) {
				iR = true;
				dR = false;
				iC = false;
				dC = false;
			}
			if(r == l && c == l) {
				dC = true;
				dR = false;
				iC = false;
				iR = false;
			}
			if(r == l && c == 0) {
				dR = true;
				iC = false;
				iR = false;
				dC = false;
			}
			if(iC) {
				c++;
			}
			if(dC) {
				c--;
			}
			if(iR) {
				r++;
			}
			if(dR) {
				r--;
			}
		}while (!(r == 0 && c == 0));
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
