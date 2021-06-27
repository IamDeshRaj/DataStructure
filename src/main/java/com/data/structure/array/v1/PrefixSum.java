package com.data.structure.array.v1;

import java.util.Random;

public class PrefixSum {

	public static void main(String[] args) {
		Random random = new Random();
		int run = random.nextInt(20);
		int left = 0, right = 0;
		int[] arr = {3, 1, 4, 8, 5, 9, 7};
		int[] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			System.out.print("i="+i+" prefixSum["+(i-1)+"]="+prefixSum[i-1]+" arr["+i+"]="+arr[i]+" prefixSum["+(i-1)+"]+"+" arr["+i+"]="+(prefixSum[i-1] + arr[i])+"\n");
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}
		
		for (int i = 0; i < run; i++) {
			left = random.nextInt(arr.length-2);
			right = random.ints(left, arr.length).findFirst().getAsInt();
			getSum(prefixSum, left, right);
		}
		
	}

	private static void getSum(int[] prefixSum, int left, int right) {
		if(left>0) {
			System.out.println("left::"+left+" right::"+right+" sum="+(prefixSum[right]-prefixSum[left-1]));
		}else {
			System.out.println("left::"+left+" right::"+right+" sum="+(prefixSum[right]));

		}
	}
}
