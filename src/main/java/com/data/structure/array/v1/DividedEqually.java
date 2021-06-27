package com.data.structure.array.v1;

public class DividedEqually {

	public static void main(String[] args) {
		int[] ik = {5, 2, 6, 1, 1, 1, 5};
		int partLength = 3;
		checkForDivideEqually(ik, partLength);
	}

	private static void checkForDivideEqually(int[] ik, int partLength) {
		int sum = 0;
		for (int i = 0; i < ik.length; i++) {
			sum += ik[i];
		}
		int partSum = sum/partLength;
		if(sum%partLength == 0) {
			System.out.println("Yes, can be divied as below");
			sum = 0;
			System.out.print("{");
			for (int i = 0; i < ik.length; i++) {
				System.out.print(ik[i]+", ");
				sum += ik[i];
				if(partSum == sum) {
					System.out.println("}");
					System.out.print("{");
					sum = 0;
				}
			}
		}else {
			System.out.println("Can't be Divied");
		}
	}
}
