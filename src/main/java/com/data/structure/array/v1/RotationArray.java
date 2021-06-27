package com.data.structure.array.v1;

public class RotationArray {

	public static void main(String[] args) {
		int[] i = {2, 3, 6, 4, 5};
		int r = 2, idx = 0;
		while(r>0) {
			rotate(i, idx, i[idx], i[idx+1], i.length);
			r--;
		}

		System.out.print("{");
		for (int t = 0; t < i.length; t++) {
			System.out.print(i[t]+", ");
		}
		System.out.print("}");
	}

	private static void rotate(int[] i, int idx, int j, int k, int length) {
		i[idx] = k;
		i[idx+1] = j;
		if(idx == length-2) {
			return;
		}
		idx++;
		rotate(i, idx, i[idx], i[idx+1], length);
		//return i;
	}
}
