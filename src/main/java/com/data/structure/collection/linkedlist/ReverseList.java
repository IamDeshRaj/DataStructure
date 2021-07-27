package com.data.structure.collection.linkedlist;

public class ReverseList {

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

		ListNode /*
					 * ds = reverseList(head); while (ds != null) { System.out.println(ds.val +
					 * ", "); ds = ds.next; }
					 */

		ds = reverseBetween(head, 1, 3);
		while (ds != null) {
			System.out.println(ds.val + ", ");
			ds = ds.next;
		}
	}

	private static ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode tmp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = tmp;
		}
		return pre;
	}

	private static ListNode reverseBetween(ListNode head, int left, int right) {
		if (left == right) {
			return head;
		}
		int len = 0;
		ListNode tmp = head;
		while (tmp != null) {
			tmp = tmp.next;
			len++;
		}

		ListNode pre = null;
		ListNode curr = head;
		if (len == 3 || (left == 1 && len == right)) {
			while (curr != null) {
				tmp = curr.next;
				curr.next = pre;
				pre = curr;
				curr = tmp;
			}
			return pre;
		}

		ListNode fa = null;
		ListNode ta = null;
		tmp = head;
		len = 0;
		while (tmp != null) {
			len++;
			if (len + 1 == left) {
				fa = tmp;
			}
			if (len - 1 == right) {
				ta = tmp;
				break;
			}
			tmp = tmp.next;
		}

		pre = null;
		if (fa == null) {
			curr = head;
		} else {
			curr = fa.next;
		}
		while (curr != ta) {
			tmp = curr.next;
			curr.next = pre;
			pre = curr;
			if (curr != null) {

			}
			curr = tmp;
		}

		if (curr != null) {
			curr.next = ta;
		}
		
		if (fa != null) {
			fa.next = pre;
			return head;
		} else {
			return pre;
		}
	}
}
