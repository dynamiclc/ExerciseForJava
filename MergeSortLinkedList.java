package algorithm.mergesort;
 
// Class definition for ListNode
class ListNode {
	int val;
	ListNode next;
 
	ListNode(int x) {
		val = x;
		next = null;
	}
}
 
public class MergeSortLinkedList {
	// Merge sort
	public static ListNode mergeSortList(ListNode head) {
		// Special cases
		if (head == null || head.next == null) {
			return head;
		}
 
		// Count nodes
		int count = 0;
		ListNode p = head; // p stands for pointer
		while (p != null) {
			count++;
			p = p.next;
		}
 
		// Divide the list
		int middle = count / 2;
		
		ListNode l = head, r = null; // l stands for left, r stands for right
		p = head;
		int countHalf = 0;
		while (p != null) {
			countHalf++;
			ListNode next = p.next;
 
			if (countHalf == middle) {
				p.next = null;
				r = next;
			}
			p = next;
		}
 
		// Recursively sort two parts
		ListNode h1 = mergeSortList(l);
		ListNode h2 = mergeSortList(r);
 
		// Merge together the two parts
		ListNode merged = merge(h1, h2);
 
		return merged;
	}
 
	public static ListNode merge(ListNode l, ListNode r) {
		ListNode pl = l; // pl stands for "pointer for left"
		ListNode pr = r; // pr stands for "pointer for right"
 
		ListNode metaHead = new ListNode(100);
		ListNode pm = metaHead; // pm stands for "pointer for merged"
 
		while (pl != null || pr != null) {
 
			if (pl == null) {
				pm.next = new ListNode(pr.val);
				pr = pr.next;
				pm = pm.next;
			} else if (pr == null) {
				pm.next = new ListNode(pl.val);
				pl = pl.next;
				pm = pm.next;
			} else {
				if (pl.val < pr.val) {
					pm.next = new ListNode(pl.val);
					pl = pl.next;
					pm = pm.next;
				} else if (pl.val == pr.val) {
					pm.next = new ListNode(pl.val);
					pm.next.next = new ListNode(pl.val);
					pm = pm.next.next;
					pl = pl.next;
					pr = pr.next;
    
				} else {
					pm.next = new ListNode(pr.val);
					pr = pr.next;
					pm = pm.next;
				}
			}
		}
		
		return metaHead.next;
	}
	
    public static void printList(ListNode x) {
		if (x != null) {
			System.out.print(x.val + " ");
			while (x.next != null) {
				System.out.print(x.next.val + " ");
				x = x.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	    // Generate a sample input [2, 3, 4, 3, 4, 5]
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(5);
 
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
        
        // Merge sort the sample input
		n1 = mergeSortList(n1);
		
        // Print out result
		printList(n1);
	}
}
