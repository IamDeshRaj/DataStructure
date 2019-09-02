package com.data.structure.collection.tree;

import java.util.ArrayList;
import java.util.List;

public class AVLTree {

	Node root;
	
	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = getHeight(root.left)+1;
		int rightHeight = getHeight(root.right)+1;
		return leftHeight > rightHeight ? leftHeight : rightHeight;
	}
	
	public void push(int element) {
		root = insert(root, element);
	}
	
	private Node insert(Node node, int element) {
		if(node == null) {
			return new Node(element);
		}
		if(node.element > element) {
			node.right = insert(node.right, element);
		}else if(node.element < element) {
			node.left = insert(node.left, element);
		}else {
			return node;
		}
		
		int balance = getBalance(node);
		// Left Left Rotate
		if(balance > 1 && node.left !=null && element < node.left.element) {
			return rotateRight(node);
		}
		// Right Right Rotate
		if(balance > 1 && node.right !=null && element > node.right.element) {
			return rotateLeft(node);
		}
		// Left Right Rotate
		if(balance > 1 && node.left !=null && element > node.left.element) {
			node.left = rotateLeft(node.left); 
			return rotateRight(node);
		}
		// Right Left Rotate
		if(balance > 1 && node.right !=null && element < node.right.element) {
			node.right = rotateRight(node.right); 
			return rotateLeft(node);
		}
		return node;
	}
	
	private Node rotateLeft(Node x) {
		Node y = x.right; 
        Node T2 = y.left; 
        y.left = x; 
        x.right = T2; 
		return y;
	}

	private Node rotateRight(Node x) {
		Node y = x.left; 
        Node T2 = y.right; 
        y.right = x; 
        x.left = T2; 
		return y;
	}

	private int getBalance(Node node) {
		return Math.abs(getHeight(node.left) - getHeight(node.right));
	}

	public boolean isSumExistsFor(int i) {
		List<Integer> list = new ArrayList();
		inOrderList(root, list);
		return false;
	}

	private void inOrderList(Node root, List<Integer> list) {
		if(root==null) {
			return;
		}
		inOrderList(root.left, list);
		list.add(root.element);
		inOrderList(root.right, list);
		list.add(root.element);
	}
}
