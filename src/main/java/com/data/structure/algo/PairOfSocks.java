package com.data.structure.algo;

import java.util.HashMap;
import java.util.Map;

public class PairOfSocks {

	public static void main(String[] args) {
		//Each same no in the ar represent a same color and different from other no.
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(12, ar));
	}
	
	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> pairMap = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if(pairMap.get(ar[i]) != null) {
				pairMap.put(ar[i], pairMap.get(ar[i])+1);
			}else {
				pairMap.put(ar[i], 1);
			}
		}
		int totalPairs =0;
		for (int i : pairMap.values()) {
			totalPairs+=i/2;
		}
		return totalPairs;
    }
}
