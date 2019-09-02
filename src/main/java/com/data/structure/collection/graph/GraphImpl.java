package com.data.structure.collection.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphImpl {

	private static int V = 0;
	private ArrayList<ArrayList<Integer>> list = null;

	public GraphImpl(int vertices) {
		V = vertices;
		list = new ArrayList<ArrayList<Integer>>(vertices);
	}

	public void insert(int idx, int element) {
		if(list.size() > idx && list.get(idx)!=null) {
			list.get(idx).add(element);
		}else {
			list.add(idx, new ArrayList<>());
			list.get(idx).add(element);
		}
	}

	public void traverseBFS(int node) {
		List<Integer> vv = new ArrayList<Integer>();
		LinkedList<Integer> traverseList = new LinkedList<Integer>();
		traverseList.add(node);
		vv.add(node);
		ArrayList<Integer> vertice = null;
		while(!traverseList.isEmpty()){
			int j = traverseList.poll();
			System.out.print(j+", ");
			vertice = list.get(j);
			for (Integer i : vertice) {
				if(!vv.contains(i)) {
					vv.add(i);
					traverseList.add(i);
				}
			}
		}
	}

	public void traverseDFS(int node) {
		List<Integer> vv = new ArrayList<Integer>();
		traverseDFS(node, vv);
	}

	private void traverseDFS(int node, List<Integer> vv) {
		if(!vv.contains(node)) {
			System.out.print(node+", ");
			vv.add(node);
			ArrayList<Integer> lst = list.get(node);
			for (Integer nxtNode : lst) {
				traverseDFS(nxtNode, vv);
			}
		}
	}
	
	public boolean isCircular() {
		System.out.println("");
		int node = list.get(0).get(0);
		List<Integer> vv = new ArrayList<Integer>();
		vv.add(0);
		System.out.print(0+", ");
		return traverseDFS(node, 0, vv);
	}

	private boolean traverseDFS(int node, int parent, List<Integer> vv) {
		if(vv.contains(node) && parent!=node) {
			return true;
		}else {
			System.out.print(node+", ");
			vv.add(node);
			ArrayList<Integer> lst = list.get(node);
			for (Integer nxtNode : lst) {
				return traverseDFS(nxtNode, node, vv);
			}
		}
		return false;
	}
}
