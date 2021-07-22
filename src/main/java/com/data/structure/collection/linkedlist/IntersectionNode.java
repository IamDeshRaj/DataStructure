package com.data.structure.collection.linkedlist;

public class IntersectionNode {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tmp = headA;
		int lengthA = 0;
		while (tmp != null) {
			tmp = tmp.next;
			lengthA++;
		}

		tmp = headB;
		int lengthB = 0;
		while (tmp != null) {
			tmp = tmp.next;
			lengthB++;
		}

		int d = lengthA - lengthB;
		if (d < 0) {
			tmp = headB;
			for (int i = d; i < 0; i++) {
				tmp = tmp.next;
			}
			while (tmp != null && headA != null && tmp != headA) {
				tmp = tmp.next;
				headA = headA.next;
			}
			if (tmp != null && headA != null && tmp == headA) {
				return headA;
			} else {
				return null;
			}
		} else if (d > 0) {
			tmp = headA;
			for (int i = 0; i < d; i++) {
				tmp = tmp.next;
			}
			while (tmp != null && headB != null && tmp != headB) {
				tmp = tmp.next;
				headB = headB.next;
			}
			if (tmp != null && headB != null && tmp == headB) {
				return headB;
			} else {
				return null;
			}
		} else {
			while (headA != null && headB != null && tmp != headB) {
				headA = headA.next;
				headB = headB.next;
			}
			if (headA != null && headB != null && headA == headB) {
				return headB;
			} else {
				return null;
			}
		}
	}
}
