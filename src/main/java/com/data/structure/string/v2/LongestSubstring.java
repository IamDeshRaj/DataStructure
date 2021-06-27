package com.data.structure.string.v2;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println((4%5));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int count = 0;
		char c = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (c == ' ') {
				if (i + 1 == s.length()) {
					return count;
				} else {
					c = s.charAt(i);
					count = 1;
				}
			} else if (c == s.charAt(i)) {
				c = ' ';
			} else {
				count++;
			}
		}
		return count;
	}
}
