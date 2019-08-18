package com.data.structure.collection;

import com.data.structure.collection.LinkedList.Node;

public class ListExpriment {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(11);
		lst.add(12);
		lst.add(13);
		lst.add(14);
		lst.add(15);
		lst.add(16);
		lst.add(17);
		lst.add(18);
		//System.out.println(lst.getElementFromLast(3));
		//lst.createCircleBwtween(3);
		if(lst.isCircular()) {
			System.out.println("isCircular::"+lst.isCircular());
			System.out.println("Circular Node::"+lst.getCircularNode());
		}else{
			lst.reverse();
			lst.reverseRecursivily();
			Node<Integer> curr = lst.first;
			do{
				System.out.print(curr.element+", ");
				curr = curr.nxt;
			}while(curr!=null);
			//lst.swapNodes(); @TODO
		}
	}
}
