package com.data.structure.array.v1;

import java.util.HashMap;
import java.util.Map;

import com.mypleaks.util.array.ArrayMapUtil;


public class MaxSumWithMaxOneGapInArray {

	ArrayMapUtil<Integer, Integer> util = new ArrayMapUtil<>();

	public static void main(String[] args) {
		//Integer rating[] = {-3, 2, 4, -1, -2, -5};
		//Integer rating[] = {9, -1, -3, 4, 5};
		Integer rating[] = {-1, -2, -3, -4, -5};
		System.out.println(new MaxSumWithMaxOneGapInArray().maximizeRatings(-1, rating));
	}

	public int maximizeRatings(int i, Integer rating[]){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		util.getArrayValueIndexPair(map, rating);
		int sum1=0; int maxIn = 0; int sum2 = 0;
		int j = -1;
		while(rating.length>j+2) {
			maxIn = Math.max(rating[j+1], rating[j+2]);
			sum1+=maxIn;
			j=map.get(maxIn);
		}
		if(rating.length>j+1 && rating[j+1]>0) {
			sum1+=rating[j+1];
		}
		System.out.println("Sum1="+sum1);
		j = rating.length;
		while(0<=j-2) {
			maxIn = Math.max(rating[j-1], rating[j-2]);
			sum2+=maxIn;
			j=map.get(maxIn);
		}
		if(rating.length>j-1 && rating[j-1]>0) {
			sum2+=rating[j-1];
		}
		System.out.println("Sum2="+sum2);

		return sum1 > sum2 ? sum1 : sum2;
	}
}
