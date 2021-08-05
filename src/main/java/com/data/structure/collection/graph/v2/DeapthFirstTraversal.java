package com.data.structure.collection.graph.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeapthFirstTraversal {

	public static void main(String[] args) {
		Map<String, List<String>> graph = new HashMap<String, List<String>>();
		graph.put("a", Arrays.asList("c", "b"));
		graph.put("b", Arrays.asList("d"));
		graph.put("c", Arrays.asList("e"));
		graph.put("d", Arrays.asList("f"));
		graph.put("e", new ArrayList<String>());
		graph.put("f", new ArrayList<String>());
		deapthFirstTraversal(graph, "a");
	}

	private static void deapthFirstTraversal(Map<String, List<String>> graph, String key) {
		System.out.println(key);
		for (String node : graph.get(key)) {
			deapthFirstTraversal(graph, node);
		}
	}
}
