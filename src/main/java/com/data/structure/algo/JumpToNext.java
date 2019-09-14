package com.data.structure.algo;

public class JumpToNext {

	public static void main(String[] args) {
		//int[] c = {1, 0, 0, 0, 1, 1, 0};
		//int[] c = {0, 0, 0, 1, 0, 0};
		//int[] c = {0, 0, 1, 0, 0, 1,0};
		int[] c = {0, 0, 0, 0, 1,0};
		System.out.println(jumpingOnClouds(c));
	}
	
	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	int i = 0;
    	while (c.length > i+2) {
			if(0 == c[i+2]) {
				i = i+2;
				jumps++;
			}else if(0 == c[i+1]){
				i = i+1;
				jumps++;
			}else if(1 == c[i+1]){
				i = i+1;
			}
		}
    	if(c.length > i+1 && 0 == c[i+1]) {
			jumps++;
    	}
    	return jumps;
    }
    
    /*static int jumpingOnClouds(int[] c) {
    	int jumps = (c[0] == 0) ? 1 : 0;
    	int zeroBit = 0;
    	boolean onJump = false;
    	for (int i = 0; i < c.length; i++) {
			if(zeroBit != c[i] && !onJump) {
				jumps++;
				onJump = true;
			}else if(c[i] == 0){
				onJump = false;
			}
		}
    	
    	return jumps;
    }*/
}
