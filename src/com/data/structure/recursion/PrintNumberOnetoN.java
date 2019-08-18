package com.data.structure.recursion;

public class PrintNumberOnetoN {

	public static void main(String[] args) {
		print(7);
	}

	private static void print(int i) {
		if(i==0){
			return;
		}
		print(i-1);
		System.out.print(i+" ");
	}
}
