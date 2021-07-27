package com.data.structure.recursion.v1;

public class MaxCut {

	public static void main(String[] args) {
		int l=23, c1=12, c2=11, c3=9;
		System.out.println(maxCuts(l, c1, c2, c3));
	}

	private static int maxCuts(int l, int c1, int c2, int c3) {
		if(l==0) {
			return 0;
		}else if(l<0) {
			return -1;
		}

		int m1 = maxCuts(l-c1, c1, c2, c3);
		int m2 = maxCuts(l-c2, c1, c2, c3);
		int m3 = maxCuts(l-c3, c1, c2, c3);
		m1 = m1==-1 ? -1 : m1+1;
		m2 = m2==-1 ? -1 : m2+1;
		m3 = m3==-1 ? -1 : m3+1;
		if(m1>m2) {
			if(m1>m3) {
				return m1;
			}else {
				return m3;
			}
		}else {
			if(m2>m3) {
				return m2;
			}else {
				return m3;
			}
		}
	}
}
