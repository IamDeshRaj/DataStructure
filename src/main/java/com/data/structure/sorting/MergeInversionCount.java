package com.data.structure.sorting;

import java.util.Arrays;

public class MergeInversionCount {

	public static int inversionCount = 0;
	public static void main(String[] args) {
		//int arr[] = {5, 3, 2, 6, 9, 7, 8};
		int arr[] = {5, 12, 15, 7};
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
		int l=0; int h = arr.length-1;
		sort(arr, l, h);
		System.out.println("inversionCount::"+inversionCount/2);
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1<arr.length) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
		}
	}

	private static int sort(int[] arr, int l, int h) {
		if(l<h) {
			int m = l+(h-l)/2;
			sort(arr, l, m);	//Left
			sort(arr, m+1, h);	//Right
			if(l-m+h == h) {
				inversionCount += swap(arr, l, h);
			}else {
				inversionCount += merge(arr, l, m, h);
			}
		}
		return inversionCount;
	}

	private static int swap(int[] arr, int l, int h) {
		int le = arr[l];
		int he = arr[h];
		if(le>he) {
			arr[l] = he;
			arr[h] = le;
			return 1;
		}
		return 0;
	}

	private static int merge(int[] arr, int l, int m, int h) {
		int leftArr[] = Arrays.copyOfRange(arr, l, m+1);
		int rightArr[] = Arrays.copyOfRange(arr, m+1, h+1);
		int tmpArr[] = new int[h-l+1];
		int leftIdx = 0; int rightIdx = 0; int i = -1;
		while (leftIdx < leftArr.length || rightIdx < rightArr.length) {
			i++;
			if(leftIdx >= leftArr.length && rightIdx < rightArr.length) {
				tmpArr[i] = rightArr[rightIdx];
				rightIdx++;
				inversionCount++;
				continue;
			}
			if(rightIdx >= rightArr.length && leftIdx < leftArr.length) {
				tmpArr[i] = leftArr[leftIdx];
				leftIdx++;
				continue;
			}
			if(leftArr[leftIdx] >= rightArr[rightIdx]) {
				tmpArr[i] = rightArr[rightIdx];
				inversionCount++;
				rightIdx++;
				continue;
			}else if(leftArr[leftIdx] < rightArr[rightIdx]) {
				tmpArr[i] = leftArr[leftIdx];
				leftIdx++;
				continue;
			}
		}
		i = 0;
		for (int j = l; j <= h; j++) {
			arr[j] = tmpArr[i];
			i++;
		}
		return inversionCount;
	}
}
