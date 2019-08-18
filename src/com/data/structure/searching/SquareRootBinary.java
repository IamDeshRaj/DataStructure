package com.data.structure.searching;

public class SquareRootBinary {

	public static void main(String[] args) {
		int oprand = 101;
		int squareRoot = calculateSquareRoot(oprand);
		System.out.println(squareRoot);
	}

	private static int calculateSquareRoot(int oprand) {
		int start = 1;
		int end = oprand;
		int squareRoot = -1;
		int m = start+(end-start)/2;
		while(start<end) {
			if(m*m == oprand) {
				return m;
			}
			if(m*m > oprand) {
				end = m-1;
			}
			if(m*m < oprand) {
				start = m+1;
				squareRoot = m;
			}
			m = start+(end-start)/2;
		}
		return squareRoot;
	}
}
