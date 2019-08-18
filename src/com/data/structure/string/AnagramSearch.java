package com.data.structure.string;

public class AnagramSearch {

	public static void main(String[] args) {
		String find = "for";
		String str = "geeksforgeeks";
		int arr[] = new int[256];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < find.length(); i++) {
			if(arr[find.charAt(i)] == -1) {
				arr[find.charAt(i)] = 0;
			}
		}

		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			if(arr[str.charAt(i)] == 0 && (i+find.length()) < str.length()) {
				found = true;
				for (int j = 0; j < find.length(); j++) {
					if(arr[str.charAt(i+j)] == -1) {
						found = false;
						break;
					}
				}
				if(found) {
					System.out.println("match found from index::"+i);
					break;
				}
			}else if((i+find.length()) > str.length()){
				System.out.println("match not found.");
				break;
			}
		}
	}
}
