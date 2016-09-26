/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

	public static void main (String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		ListNode l2 = new ListNode(0);
		ListNode head = add(l1, l2);
		printList(l1);
		printList(l2);

		printList(head);

    	// head = handle(head);

    	// printList(head);
	}

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	ListNode head = add(l1, l2);
    	return handle(head);
    }

    public static ListNode add(ListNode p1, ListNode p2) {

    	ListNode temp = null;
    	ListNode head = null;

    	while (p1!=null&&p2!=null) {

    		if (p1==null) {
    			temp.next = p2;
    			break;
    		} else if (p2 == null) {
    			temp.next = p1;
    			break;
    		}

            if (null==temp) {
                temp = new ListNode(0);
            } else {
                temp.next = new ListNode(0);
                temp = temp.next;
            }

    		if (null==head) {
    			head = temp;
    		}

    		temp.val = p1.val + p2.val;

    		p1 = p1.next;
    		p2 = p2.next;
    	}

    	return head;
    }

    public static ListNode handle(ListNode head) {

    	int temp = 0;
    	ListNode p = head;

    	while (p!=null) {
    		int i = p.val + temp;
    		System.out.println(p.next);
    		System.out.println("i:" + i);
    		p.val = i % 10;
    		temp = i / 10;

    		if (p.next==null) {
    			if (temp!=0) {
    				p.next = new ListNode(temp);
    				break;
    			}
    		}

    		p = p.next;
    	}

    	return head;
    }

    public static void printList(ListNode p) {
    	while (p!=null) {
    		System.out.print(p.val + ",");
    		p = p.next;
    	}
    	System.out.println();
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

