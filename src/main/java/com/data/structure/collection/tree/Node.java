package com.data.structure.collection.tree;

public class Node<E>{

	E element;
	Node<E> left;
	Node<E> right;
	
	public Node(E element) {
		this.element = element;
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
