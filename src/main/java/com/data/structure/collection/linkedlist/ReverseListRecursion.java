package com.data.structure.collection.linkedlist;

public class ReverseListRecursion {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode tail = head;
		tail.next = new ListNode(2);
		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(4);
		tail = tail.next;
		tail.next = new ListNode(5);
		ListNode ds = reverseList(head);
		while (ds != null) {
			System.out.println(ds.val + ", ");
			ds = ds.next;
		}
	}

	private static ListNode reverseList(ListNode node) {
		if(node.next == null) {
			return node;
		}
		ListNode r = reverseList(node.next);
		node.next.next = node;
		node.next = null;
		return r;
	}

}
