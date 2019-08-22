package com.data.structure.collection.stack;

public class StockSpan {
	
	Node head = null;
	
	public void push(int element) {
		head = new Node(element, head);
	}
	
	public void getSpan() {
		Node curr = head;
		Node next = head.nxt;
		int span = 1;
		System.out.print(curr.element);
		do {
			if(curr.element < next.element) {
				System.out.println("->"+span);
				span = 1;
				curr = curr.nxt;
				next = curr == null ? null : curr.nxt;
				if(next != null) {
					System.out.print(curr.element);
				}else {
					System.out.println(curr.element+"->"+span);
					break;
				}
				//nextRef = nextRef.nxt;
			}else {
				next = next.nxt;
				span++;
				if(next == null) {
					System.out.println("->"+span);
					span = 1;
					curr = curr.nxt;
					next = curr == null ? null : curr.nxt;
					if(next != null) {
						System.out.print(curr.element);
					}else {
						System.out.println(curr.element+"->"+span);
						break;
					}
				}
			}
		}while(!(curr==null && next==null));
	}
	
	public static class Node{
		int element = 0;
		Node nxt = null;
		public Node(int element, Node nxt) {
			super();
			this.element = element;
			this.nxt = nxt;
		}
		@Override
		public String toString() {
			if(nxt == null) {
				return "Node [element=" + element + ", nxt=null]";
			}else {
				return "Node [element=" + element + ", nxt="+ nxt.element + "]";
			}
		}
	}

	public void getNextGreaterToRight() {
		Node curr = head;
		Node next = head.nxt;
		System.out.print(curr.element);
		do {
			if(curr.element < next.element) {
				System.out.println("->"+next.element);
				curr = curr.nxt;
				next = curr == null ? null : curr.nxt;
				if(next != null) {
					System.out.print(curr.element);
				}else {
					System.out.println(curr.element+"->-1");
					break;
				}
			}else {
				next = next.nxt;
				if(next == null) {
					System.out.println("->-1");
					curr = curr.nxt;
					next = curr == null ? null : curr.nxt;
					if(next != null) {
						System.out.print(curr.element);
					}else {
						System.out.println(curr.element+"->-1");
						break;
					}
				}
			}
		}while(!(curr==null && next==null));
	}
}
