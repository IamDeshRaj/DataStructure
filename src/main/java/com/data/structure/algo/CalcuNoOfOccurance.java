package com.data.structure.algo;

public class CalcuNoOfOccurance {

	public static void main(String[] args) {
		String s = "aba";
		System.out.println(repeatedString(s, 10));
	}
	
	static long repeatedString(String s, long n) {
        int countOfAInS = 0;
        int countTillRemender = 0;
        long remender = n%s.length();
        long dividend = n/s.length();
        char[] aArray = s.toCharArray();
        for (int i = 0; i < aArray.length; i++) {
			if(aArray[i] == 'a') {
				countOfAInS++;
			}
		}
        for (int i = 0; i < remender; i++) {
			if(aArray[i] == 'a') {
				countTillRemender++;
			}
		}
        return dividend*countOfAInS+countTillRemender;
    }
}
