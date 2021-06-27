package com.data.structure.array.v2;

import java.util.Arrays;

public class RemoveValue {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		removeElement(nums, val);
	}

	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] =nums[i];
				j++;
			}
		}
		nums = Arrays.copyOfRange(nums, 0, j);
		return j;
	}
}
