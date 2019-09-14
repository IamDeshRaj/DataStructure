package com.data.structure.algo;

public class UpLowHill {

	public static void main(String[] args) {
		//String s = "UDDDUDUU";
		String s = "DDUUDDUDUUUD";
		int a = 12;
		System.out.println(countingValleys(a, s));
	}
	
	public static int countingValleys(int n, String s) {
		int valleys = 0;
		int steps = 0;
		boolean downward = false;
		char array[] = s.toCharArray();
		for (int i = 0; i < n; i++) {
			if('D' == array[i]) {
				steps -= 1;
			}
			if('U' == array[i]) {
				steps += 1;
			}
			if(steps==0 && downward) {
				valleys++;
				downward = false;
			}
			if(steps<0) {
				downward = true;
			}
		}
		
		return valleys;
    }
}
