package com.data.structure.array.v2;

public class MaximumPopulation {

	// logs = [[1950,1961],[1960,1971],[1970,1981]]
	public static int maximumPopulation(int[][] logs) {
		int[] person = logs[0];
		int year = person[0];
		for (int i = 1; i < logs.length; i++) {
			if (logs[i][0] < person[1] && logs[i][1] > person[1]) {
				year = person[1];
			} else {

			}
		}
		return year;
	}
}
