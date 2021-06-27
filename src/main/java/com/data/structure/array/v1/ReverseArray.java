package com.data.structure.array.v1;

public class ReverseArray {

	public static void main(String[] args) {
		int[] i = {2, 3, 6, 4, 5};
		//normalSwap(i);
		int k = 0;
		int j = i.length-1;
		while(k<j){
			swap(i, i[k], i[j], k++, j--);
		}

		System.out.print("{");
		for (int t = 0; t < i.length; t++) {
			System.out.print(i[t]+", ");
		}
		System.out.print("}");
	}

	private static void swap(int[] i, int k, int j, int kIdx, int jIdx) {
		i[jIdx] = k;
		i[kIdx] = j;
	}

	private static void normalSwap(int[] i) {
		System.out.print("{");
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j]+", ");
		}
		System.out.println("}");
		for (int j = 0; j < i.length; j++) {
			int temp=i[j];
			i[j]=i[i.length-1-j];
			i[i.length-1-j]=temp;
			if(i.length-1-j <= j) {
				break;
			}
		}
		System.out.print("{");
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j]+", ");
		}
		System.out.print("}");
	}
}
