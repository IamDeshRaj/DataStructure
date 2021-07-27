package com.data.structure.recursion.v1;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(add(1234));
	}

	private static int add(int i) {
		if(i<10) {
			return i;
		}
		return add(i/10) + i%10;
	}
}
