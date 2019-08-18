package com.data.structure.recursion;

public class MaxCombination {

	public static void main(String[] args) {
		maxComb("abc", "", 0);
	}

	private static void maxComb(String str, String curr, int j) {
		if(str.length()==j) {
			System.out.print(curr+" ");
			return;
		}
		maxComb(str, curr, ++j);
		maxComb(str, curr+str.charAt(j-1), j++);
	}
}
