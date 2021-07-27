package com.data.structure.recursion.v2;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 9;
		System.out.println(fib(i));
	}

	private static int fib(int i) {
		if(i <= 1) {
			return i;
		}
		return fib(i-1)+fib(i-2);
	}
}
