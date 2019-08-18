package com.data.structure.searching;

import java.time.LocalTime;

public class MostAppeared {

	public static void main(String[] args) {
		String str = "23:59:00z";
		str=str.replaceAll("[^\\d:]", "");
		System.out.println(str);
		System.out.println(LocalTime.parse(str));
	}
}
