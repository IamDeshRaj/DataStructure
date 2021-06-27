package com.data.structure.array.v2;

import java.util.ArrayList;
import java.util.List;

public class SumBigNumber {

	public static void main(String[] args) {
		List<Long> ar = new ArrayList<Long>();
		ar.add(1000000001l);
		ar.add(1000000002l);
		ar.add(1000000003l);
		ar.add(1000000004l);
		ar.add(1000000005l);
		long a = aVeryBigSum(ar);
		System.out.println(a);
	}

	public static long aVeryBigSum(List<Long> ar) {
		long a = 0l;
		for (Long long1 : ar) {
			a += long1;
		}
		//return Double.doubleToLongBits(a);
		return a;
	}
}
