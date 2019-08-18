package com.data.structure.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSum {

	public static void main(String[] args) {
		int arr[] = {4, 6, -4, -2, 10, 2};
		Set<Integer> sumSet = new HashSet<>();
		sumSet.add(0);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sumSet.contains(sum)) {
				System.out.println("Found");
				break;
			}
			sumSet.add(sum);
		}
	}
}
