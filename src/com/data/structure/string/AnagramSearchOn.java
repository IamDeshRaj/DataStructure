package com.data.structure.string;

public class AnagramSearchOn {

	public static void main(String[] args) {
		String find = "for";
		String str = "geeksforgeeks";
		int sumfind = 0; int strSum = 0;
		for (int i = 0; i < find.length(); i++) {
				sumfind += find.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			strSum += str.charAt(i);
			if(i-find.length()>=0) {
				strSum -= str.charAt(i-find.length());
			}
			if(strSum == sumfind) {
				System.out.println("Match Found at "+(i-find.length()));
				break;
			}
		}
		if(strSum!=sumfind) {
			System.out.println("Match Not Found");
		}
	}
}
