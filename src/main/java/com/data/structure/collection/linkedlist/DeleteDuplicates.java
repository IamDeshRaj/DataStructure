package com.data.structure.collection.linkedlist;

public class DeleteDuplicates {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode tail = head;
		tail.next = new ListNode(2);

		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(3);
		tail = tail.next;
		tail.next = new ListNode(4);
		tail = tail.next;
		tail.next = new ListNode(4);
		tail = tail.next;
		tail.next = new ListNode(5);
		tail = tail.next;

		ListNode ds = deleteDuplicates(head);
		while (ds != null) {
			System.out.println(ds.val + ", ");
			ds = ds.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode fh = null;
		ListNode c = null;
		boolean hadDups = false;
		while (head != null) {
			if (head.next != null && head.val != head.next.val) {
				ListNode tmp = head;
				while (head.next.next != null && head.next.val == head.next.next.val) {
					head = head.next;
					hadDups = true;
				}
				if(hadDups) {
					
				}
				if (c == null) {
					c = tmp;
					fh = c;
				} else {
					c.next = tmp;
					c = tmp;
				}
			}
			head = head.next;
		}
		return fh;
	}
}
