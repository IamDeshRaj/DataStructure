package com.data.structure.searching;

//@TODO => a*a+b*b=c*c
public class RightangularTriplet {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 5; int l = 0; int h = arr.length-1; int calSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(l==h) {
				break;
			}
			calSum=arr[l]+arr[h];
			if(calSum==sum) {
				String str = String.format("Sum found with indexes %s and %s with values like %s and %s", l, h, arr[l], arr[h]);
				System.out.println(str);
				break;
			}
			if(arr[l] > arr[h]) {
				l++;
			}else {
				h--;
			}
		}
	}
}
