package com.data.structure.collection.tree;

public class TreeExpriment {

	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>();
		tree.push(10);
		tree.push(5);
		tree.push(13);
		tree.push(3);
		tree.push(12);
		tree.push(16);
		tree.push(6);
		tree.inOrderNavigation();
		tree.preOrderNavigation();
		tree.postOrderNavigation();
		tree.levelOrderTraversal();
		System.out.println("\n"+tree.height());
	}
}
