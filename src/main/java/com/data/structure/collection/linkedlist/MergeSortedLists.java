package com.data.structure.collection.linkedlist;

public class MergeSortedLists {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode tail = l1;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(5);
		tail = tail.next;
		tail.next = new ListNode(6);
		tail = tail.next;
		tail.next = new ListNode(7);

		ListNode l2 = new ListNode(2);
		tail = l2;
		tail.next = new ListNode(4);

		ListNode ds = merge(l1, l2);
		while (ds != null) {
			System.out.println(ds.val + ", ");
			ds = ds.next;
		}
	}

	private static ListNode merge(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		if (l1.val < l2.val) {
			l1.next = merge(l1.next, l2);
			return l1;
		} else {
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}
}
