package com.data.structure.collection.graph.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class BreathFirstTraversal {

	public static void main(String[] args) {
		Map<String, List<String>> graph = new HashMap<String, List<String>>();
		graph.put("a", Arrays.asList("c", "b"));
		graph.put("b", Arrays.asList("d"));
		graph.put("c", Arrays.asList("e"));
		graph.put("d", Arrays.asList("f"));
		graph.put("e", new ArrayList<String>());
		graph.put("f", new ArrayList<String>());
		breathFirstTraversal(graph, "a");
	}

	public static void breathFirstTraversal(Map<String, List<String>> graph, String key) {
		Queue<Node> queue = new LinkedBlockingDeque<Node>();
		queue.add(new Node(key));
		Node node = queue.poll();
		while (node != null) {
			System.out.println(node.value);
			for (String value : graph.get(node.value)) {
				queue.add(new Node(value));
			}
			node = queue.poll();
		}
	}

	static class Node {
		String value;

		public Node(String value) {
			this.value = value;
		}
	}
}
