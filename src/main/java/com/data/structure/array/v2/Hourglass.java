package com.data.structure.array.v2;

import java.util.List;

public class Hourglass {

	public static int hourglassSum(List<List<Integer>> arr) {
		int maxSum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				List<Integer> upperList = arr.get(i);
				int upperSum = upperList.get(j)+upperList.get(j+1)+upperList.get(j+2);
				List<Integer> middleList = arr.get(i+1);
				int middleSum = middleList.get(j)+middleList.get(j+1)+middleList.get(j+2);
				List<Integer> lowerList = arr.get(i+2);
				int lowerSum = lowerList.get(j)+lowerList.get(j+1)+lowerList.get(j+2);
				int currentSum = upperSum+middleSum+lowerSum;
				maxSum = maxSum > currentSum ? maxSum : currentSum;
			}
		}
		return maxSum;
	}
}
