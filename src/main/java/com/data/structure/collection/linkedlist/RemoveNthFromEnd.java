package com.data.structure.collection.linkedlist;

public class RemoveNthFromEnd {

	public static void main(String[] args) {
		ListNode head = null;
		ListNode current = null;
		for (int i = 1; i < 6; i++) {
			if (current == null) {
				current = new ListNode(i);
				head = current;
			} else {
				current.next = new ListNode(i);
				current = current.next;
			}
		}
		current = head;
		while(current !=null) {
			System.out.print(current.val+", ");
			current = current.next;
		}
		System.out.println("\n removing");
		current = removeNthFromEnd(head, 2);
		while(current !=null) {
			System.out.print(current.val+", ");
			current = current.next;
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        
        int length = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            length++;
        }
        node = head;
        int idxToRemove = length - n; // 3
        if (idxToRemove == 0) {
            return node.next;
        }
        for(int i = 1; i < length; i++){
            if(i == idxToRemove){
                if(node.next != null){
                    node.next = node.next.next;
                }else{
                    node.next = null;
                }
                return head;
            }
            node = node.next;
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}