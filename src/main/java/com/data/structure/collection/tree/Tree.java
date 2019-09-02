package com.data.structure.collection.tree;

public class Tree {

	Node root;

	public void push(int element) {
		if(root == null) {
			root = push(root, element);;
		}else {
			push(root, element);
		}
	}

	private Node push(Node curr, int element) {
		if(curr == null) {
			return new Node(element);
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

	private void inOrderPrint(Node root) {
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

	private void preOrderPrint(Node root) {
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

	private void postOrderPrint(Node root) {
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
			printNodeAtGivenLevel(root, i, false);
		}
	}

	private void printNodeAtGivenLevel(Node root, int level, boolean isSprialTraversal) {
		if(root == null) {
			return;
		}else if(level == 1) {
			System.out.print(root.element+", ");
		}else {
			Node tmp = null;
			Node nodeLeft = root.left;
			Node nodeRight = root.right;
			if(isSprialTraversal && level%2==0) {
				tmp = nodeLeft;
				nodeLeft = nodeRight;
				nodeRight = tmp;
			}
			printNodeAtGivenLevel(nodeLeft, level-1, isSprialTraversal);
			printNodeAtGivenLevel(nodeRight, level-1, isSprialTraversal);
		}
	}

	public int height() {
		return height(root);
	}

	private int height(Node root) {
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

	public void spiralLevelOrderTraversal() {
		int h = height();
		for (int i = 1; i <= h; i++) {
			printNodeAtGivenLevel(root, i, true);
		}
	}

	public boolean isChildrenSum() {
		return isChildrenSum(root)==1;
	}

	private int isChildrenSum(Node root) {
		if(root == null || (root.left == null && root.right == null)) {
			return 1;
		}else {
			int leftData = 0, rightData = 0; 
			if(root.right != null) {
				leftData = (int) root.right.element;
			}
			if(root.left != null) {
				rightData = (int) root.left.element;
			}
			if(leftData == rightData && (isChildrenSum(root.left) == isChildrenSum(root.right))) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
	public boolean isBalanced() {
		System.out.println("");
		return isBalanced(root);
	}

	private boolean isBalanced(Node root) {
		if(root==null) {
			return true;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		if(Math.abs(lh-rh)<2 && isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isBST() {
		int leftHighest = isLowest(root.left, false);
		int rightlowest = isLowest(root.right, true);
		if(leftHighest < (int)root.element && rightlowest > (int)root.element) {
			return true;
		}else {
			return false;
		}
	}

	private int isLowest(Node root, boolean lookLowest) {
		if(root == null) {
			return 0;
		}
		int left = isLowest(root.left, lookLowest);
		int right = isLowest(root.right, lookLowest);
		if(lookLowest) {
			int min = 0;
			if(left == 0 || right == 0) {
				min = Math.max(left, right);
			}else {
				min = Math.min(left, right);
			}
			if(min == 0) {
				return Math.max((int)root.element, min);
			}else {
				return Math.min((int)root.element, min);
			}
		}else {
			return Math.max((int)root.element, Math.max(left, right));
		}
	}
}
