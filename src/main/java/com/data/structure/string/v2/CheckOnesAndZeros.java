package com.data.structure.string.v2;

public class CheckOnesAndZeros {
	public static void main(String[] args) {
		System.out.println(checkZeroOnes("1110010001"));
	}

	public static boolean checkZeroOnes(String s) {
		int max1s = 0;
		int max0s = 0;
		int c1s = 0;
		int c0s = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((int)c == 49) {
				c0s = 0;
				++c1s;
				if(max1s < c1s) {
					max1s = c1s;
				}
			} else if ((int)c == 48) {
				c1s = 0;
				++c0s;
				if(max0s < c0s) {
					max0s = c0s;
				}
			}
		}
		return max1s > max0s;
	}
}
