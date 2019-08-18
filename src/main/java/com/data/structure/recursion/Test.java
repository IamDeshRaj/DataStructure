package com.data.structure.recursion;

public class Test {

	public static void main(String[] args) {
		append("ABC", "", 0);
	}
	

	public static void append(String str, String combo, int index){
		System.out.println(combo);
		if(index==2) {
			return;
		}
		append(str, combo+str.charAt(index+1), index+1);
    }
}
