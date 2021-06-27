package com.data.structure.array.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MatchString {

	public static void main(String[] args) {
		/*
		 * List<String> strings = new ArrayList<String>(); strings.add("def");
		 * strings.add("de"); strings.add("fgh");
		 * 
		 * List<String> query = new ArrayList<String>(); query.add("de");
		 * query.add("lmn"); query.add("fgh");
		 */

		List<String> strings = new ArrayList<String>();
		strings.add("abcde");
		strings.add("sdaklfj");
		strings.add("asdjf");
		strings.add("na");
		strings.add("basdn");
		strings.add("sdaklfj");
		strings.add("asdjf");
		strings.add("na");
		strings.add("asdjf");
		strings.add("na");
		strings.add("basdn");
		strings.add("sdaklfj");
		strings.add("asdjf");

		List<String> query = new ArrayList<String>();
		query.add("abcde");
		query.add("sdaklfj");
		query.add("asdjf");
		query.add("na");
		query.add("basdn");

		List<Integer> integers = matchingStrings(strings, query);
		for (Integer integer : integers) {
			System.out.print(integer + ", ");
		}
	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		System.out.println("queries hash");
		queries.forEach(query -> {
			System.out.print(query.hashCode() + ", ");
		});
		System.out.println("\nStrings hash");
		strings.forEach(string -> {
			System.out.print(string.hashCode() + ", ");
		});
		return new ArrayList<Integer>();
	}

	public static List<Integer> matchingStringsTry2nd(List<String> strings, List<String> queries) {
		Map<String, Integer> counting = new LinkedHashMap<String, Integer>();
		queries.forEach(query -> {
			counting.put(query, 0);
		});
		strings.forEach(string -> {
			Integer count = counting.get(string);
			if (count != null) {
				counting.put(string, count + 1);
			}
		});
		return new ArrayList<Integer>(counting.values());
	}

	public static List<Integer> matchingStringsTry1st(List<String> strings, List<String> queries) {
		Integer[] count = new Integer[queries.size()];
		for (String string : strings) {
			int idx = queries.indexOf(string);
			if (idx != -1) {
				if (count[idx] == null) {
					count[idx] = 1;
				} else {
					count[idx] = count[idx] + 1;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			Integer integer = count[i];
			if (integer == null) {
				count[i] = 0;
			}
		}
		return Arrays.asList(count);
	}
}
