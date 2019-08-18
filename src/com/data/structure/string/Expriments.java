package com.data.structure.string;

public class Expriments {

	public static void main(String[] args) {
		String s = "-123";
		int result = 0;
		int i = 0;
		boolean negative = false;
		while(s.length() > i) {
			char a = (char)s.charAt(i);
			i++;
			if(a < 48) {
				negative = true;
				continue;
			}
			int j = (char)a;
			result *= 10; 
			result -= (j-48);
		}
		System.out.println(negative ? result : -result);
	}
}
