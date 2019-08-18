package com.data.structure.recursion;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(fact(4, 1));
	}
	 
	
	public static int fact(int i, int k) {
		if(i==0) {
			return k;
		}
		return fact(i-1, i*k);
	}
}
