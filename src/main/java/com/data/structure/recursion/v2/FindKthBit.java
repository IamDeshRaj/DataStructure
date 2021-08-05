package com.data.structure.recursion.v2;

public class FindKthBit {

	public static void main(String[] args) {
		double a = Math.pow(2,2);
		System.out.println(a);
		//System.out.println(findKthBit(2, 3));
	}
	public static char findKthBit(int n, int k) {
		String s = buildStr(n);
		return s.charAt(k-1);
	}

	public static String buildStr(int n) {
		if (n == 1) {
			return "0";
		}
		String normalStr = buildStr(n - 1);
		String s = normalStr + "1" + reverse(invert(normalStr.toCharArray()), normalStr.length()-1);
		return s;
	}

	private static char[] invert(char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (c == '1') {
				charArray[i] = '0';
			} else {
				charArray[i] = '1';
			}
		}
		return charArray;
	}

	private static String reverse(char[] charArray, int idx) {
		if(idx == 0) {
			return charArray[idx]+"";
		}
		return charArray[idx] + reverse(charArray, idx-1);
	}
}
