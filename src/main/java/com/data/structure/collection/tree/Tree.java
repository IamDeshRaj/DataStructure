package com.data.structure.collection.tree;

public class Tree<E> {

	Node<E> root;

	public void push(E element) {
		if(root == null) {
			root = push(root, element);;
		}else {
			push(root, element);
		}
	}

	private Node<E> push(Node<E> curr, E element) {
		if(curr == null) {
			return new Node<E>(element);
		}
		if((int)curr.element > (int)element) {
			curr.left = push(curr.left, element);
		}else if((int)curr.element < (int)element) {
			curr.right = push(curr.right, element);
		}else {
			System.out.println("Element "+((int)element)+" already exist.");
		}
		return curr;
	}

	public void inOrderNavigation() {
		inOrderPrint(root);
		System.out.print("\n");
	}

	private void inOrderPrint(Node<E> root) {
		if(root == null) {
			return;
		}
		inOrderPrint(root.left);
		System.out.print(root.element+", ");
		inOrderPrint(root.right);
	}

	public void preOrderNavigation() {
		preOrderPrint(root);
		System.out.print("\n");
	}

	private void preOrderPrint(Node<E> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.element+", ");
		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}

	public void postOrderNavigation() {
		postOrderPrint(root);
		System.out.print("\n");
	}

	private void postOrderPrint(Node<E> root) {
		if(root == null) {
			return;
		}
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.print(root.element+", ");
	}

	public void levelOrderTraversal() {
		int h = height();
		for (int i = 1; i <= h; i++) {
			printNodeAtGivenLevel(root, i);
		}
	}

	private void printNodeAtGivenLevel(Node<E> root, int level) {
		if(root == null) {
			return;
		}else if(level == 1) {
			System.out.print(root.element+", ");
		}else {
			printNodeAtGivenLevel(root.left, level-1);
			printNodeAtGivenLevel(root.right, level-1);
		}
	}

	public int height() {
		return height(root);
	}

	private int height(Node<E> root) {
		if (root == null) {
			return 0;
		}else { 
			/* compute  height of each subtree */
			int hl = height(root.left)+1; 
			int hr = height(root.right)+1; 
			/* use the larger one */
			return hl > hr ? hl : hr;  
		} 
		
	}

	@Override
	public String toString() {
		return "Node [root=" + root + "]";
	}
}
