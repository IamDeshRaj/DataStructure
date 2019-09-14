package com.data.structure.algo;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int l = rotLeft(a, 43).length;
		for (int i = 0; i < l; i++) {
			System.out.print(a[i]+", ");
		}
	}
	
	static int[] rotLeft(int[] a, int d) {
		int actualRotate = d > a.length ? d%a.length : d;
		int[] initialArray = Arrays.copyOfRange(a, 0, actualRotate);
		int[] lastArray = Arrays.copyOfRange(a, actualRotate, a.length);
		for (int i = 0; i < lastArray.length; i++) {
			a[i] = lastArray[i];
		}
		int j = lastArray.length;
		for (int i = 0; i < initialArray.length; i++) {
			a[j] = initialArray[i];
			j++;
		}
		return a;
    }
}
