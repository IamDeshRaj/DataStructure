package com.data.structure.array.v2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 2, 3, 3, 5};
		System.out.println(removeDuplicates(numbers));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	    	if(nums[i] != nums[j]) {
	    		i++;
	    		nums[i] = nums[j];
	    	}
	    }
	    return i + 1;
	}
}
