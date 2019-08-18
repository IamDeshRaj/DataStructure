package com.data.structure.searching;

public class SquareRoot {

	public static void main(String[] args) {
		int oprand = 101;
		int squareRoot = calculateSquareRoot(oprand);
		System.out.println(squareRoot);
	}

	private static int calculateSquareRoot(int oprand) {
		int i=1;
		int squareRoot = 0;
		while (oprand>=i*i) {
			i++;
			squareRoot = i;
		}
		if(oprand==i*i) {
			return squareRoot;
		}else {
			return squareRoot-1;
		}
	}
}
