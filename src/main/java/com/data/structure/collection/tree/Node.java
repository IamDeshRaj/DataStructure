package com.data.structure.collection.tree;

public class Node{

	int element, height; 
	Node left;
	Node right;
	
	public Node(int element) {
		this.element = element;
		height = 1;
	}

	@Override
	public String toString() {
		if(left!=null && right!=null) {
			return "Node [element=" + element + ", left=" + left + ", right=" + right + "]";
		}else if(left!=null && right==null) {
			return "Node [element=" + element + ", left=" + left + "]";
		}else if(left==null && right!=null) {
			return "Node [element=" + element + ", right=" + right + "]";
		}else {
			return "Node [element=" + element + "]";
		}
	}
	
}
