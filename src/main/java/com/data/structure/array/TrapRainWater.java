package com.data.structure.array;

public class TrapRainWater {

	public static void main(String[] args) {
		int[] arr = {7,4, 9, 2, 8, 3, 6};
		trapWater(arr);
	}

	private static void trapWater(int[] height) {
		if(height.length < 2)
			return;
		int max = height[0];
		int[] left = new int[height.length];
		for (int i = 0; i < left.length; i++) {
			if(max > height[i]) {
				left[i] = max;
			}else{
				left[i] = height[i];
				max = height[i];
			}
		}
		max = height[height.length-1];
		int[] right = new int[height.length];
		for (int i = left.length-1; i > -1; i--) {
			if(max > height[i]) {
				right[i] = max;
			}else{
				right[i] = height[i];
				max = height[i];
			}
		}
		max=0;
		for (int i = 0; i < height.length; i++) {
			max+=Math.min(left[i], right[i])-height[i];
		}
		System.out.println("Capacity::"+max);
	}
	
	/*public static void main(String[] args) {
		int[] arr = {7,4, 9, 2, 8, 3, 6};
		int smallest = arr[0] > arr[arr.length-1] ? arr[arr.length-1] : arr[0];
		int unitsOfWater = 0;
		for (int i = 1; i < arr.length-1; i++) {
			if(smallest-arr[i]>0) {
				unitsOfWater += smallest-arr[i];
			}
		}
		System.out.println("Total unitsOfWater::"+unitsOfWater);
	}*/
}
