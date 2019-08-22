package com.data.structure.collection.stack;

public class StackImplementation<E> {

	int size = 0;
	Node<E> head = null;
	
	public StackImplementation() {
	}
	
	public StackImplementation(E element) {
		head = new Node<E>(element, null);
		size++;
	}
	
	public void push(E element) {
		size++;
		head = new Node<E>(element, head);
	}
	
	public E pop() {
		if(head != null) {
			size--;
			E node = head.element;
			head = head.nxt;
			return node;
		}else {
			System.out.println("Stack is Empty");
			return null;
		}
	}
	
	public int size() {
		return size;
	}
	
	public static class Node<E>{
		E element = null;
		Node<E> nxt = null;
		Node<E> prv = null;
		public Node(E element, Node<E> nxt) {
			super();
			this.element = element;
			this.nxt = nxt;
		}
		@Override
		public String toString() {
			if(nxt == null) {
				return "Node [element=" + element + ", nxt=null, prv=" + prv.element + "]";
			}else if(prv == null) {
				return "Node [element=" + element + ", nxt="+ nxt.element+ ", prv=null]";
			}else {
				return "Node [element=" + element + ", nxt="+ nxt.element+ ", prv=" + prv.element + "]";
			}
		}
	}
}
