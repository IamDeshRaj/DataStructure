package com.data.structure.collection.tree;

public class TreeExpriment {

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		tree.push(2);
		tree.push(8);
		tree.push(30);
		tree.push(15);
		tree.push(25);
		tree.push(12);
		
		tree.isSumExistsFor(42);
		
		/*Tree<Integer> tree = new Tree<>();
		tree.push(20);
		tree.push(10);
		tree.push(30);
		tree.push(35);
		tree.push(40);
		tree.push(45);
		tree.push(25);
		tree.push(15);
		tree.push(5);
		Tree tree = new Tree();
		tree.push(2);
		tree.push(8);
		tree.push(30);
		tree.push(15);
		tree.push(25);
		tree.push(12);
		tree.inOrderNavigation();
		tree.preOrderNavigation();
		tree.postOrderNavigation();
		tree.levelOrderTraversal();
		System.out.println("\n"+tree.height());
		tree.spiralLevelOrderTraversal();
		//System.out.println("\n"+tree.isChildrenSum());
		System.out.println("\nisBalanced()::"+tree.isBalanced());
		System.out.println("\nisBST::"+tree.isBST());*/
	}
}
