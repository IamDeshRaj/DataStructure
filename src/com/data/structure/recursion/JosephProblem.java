package com.data.structure.recursion;

public class JosephProblem {

	public static void main(String[] args) {
		//int i = 4;
		System.out.println(1%6);
		//System.out.println(joseph(7, 3));
	}
	
	public static int joseph(int n, int k) {
		if(n==1) {
			System.out.println("n::"+n+" k::"+k);
			return n;
		}
		int j = (joseph(n-1, k)+k-1)%n+1;
		System.out.println("n::"+n+" k::"+k+" j::"+j);
		return j;
	}
}
