package com.data.structure.array.v1;

public class EquilibirumPoint {

	public static void main(String[] args) {
		int arr[] = {4, 2, 4, -2, 2, 4, 4};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println("");
		System.out.println("sum::"+sum);
		calcEquilibirum(arr, sum);
	}
	
	public static void calcEquilibirum(int arr[], int sum) {
		//int sumOfArr[] = new int[arr.length];
		
		int anotherSum = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			if(anotherSum == sum-arr[i]) {
				System.out.println("Yes Equal at index ::"+i);
			}else {
				sum -= arr[i];
				anotherSum += arr[i];
			}
		}
	}
}
