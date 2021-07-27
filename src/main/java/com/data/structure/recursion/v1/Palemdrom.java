package com.data.structure.recursion.v1;

public class Palemdrom {

	public static void main(String[] args) {
		System.out.println("Is this string Palemdrom::"+isPalemdrom("ada"));
	}

	private static Boolean isPalemdrom(String str) {
		return check(str, 0, str.length()-1);
	}

	private static Boolean check(String str, int i, int j) {
		if(str.charAt(i) != str.charAt(j)) {
			return false;
		}
		if(i==j || i>j) {
			return true;
		}
		return check(str, i+1, j-1);
	}
}
