package algorithm.mergesort;

import datastructure.listnode.ListNode;
 
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
    
    ListNode pLeft = head, pRight = null; // pLeft stands for left, pRight stands for right
    p = head;
    int countHalf = 0;
    while (p != null) {
      countHalf++;
      ListNode next = p.next;
 
      if (countHalf == middle) {
        p.next = null;
        pRight = next;
      }
      p = next;
    }
 
    // Recursively sort two parts
    ListNode pHeadLeft = mergeSortList(pLeft);
    ListNode pHeadRight = mergeSortList(pRight);
 
    // Merge together the two parts
    ListNode merged = merge(pHeadLeft, pHeadRight);
 
    return merged;
  }
 
  public static ListNode merge(ListNode pLeftInput, ListNode pRightInput) {
    ListNode pLeft = pLeftInput; // pLeft stands for "pointer for left"
    ListNode pRight = pRightInput; // pRight stands for "pointer for right"
 
    ListNode metaHead = new ListNode(0);
    ListNode pMerged = metaHead; // pMerged stands for "pointer for merged"
 
    while (pLeft != null || pRight != null) {
 
      if (pLeft == null) {
        pMerged.next = new ListNode(pRight.val);
        pRight = pRight.next;
        pMerged = pMerged.next;
      } else if (pRight == null) {
        pMerged.next = new ListNode(pLeft.val);
        pLeft = pLeft.next;
        pMerged = pMerged.next;
      } else {
        if (pLeft.val < pRight.val) {
          pMerged.next = new ListNode(pLeft.val);
          pLeft = pLeft.next;
          pMerged = pMerged.next;
        } else if (pLeft.val == pRight.val) {
          pMerged.next = new ListNode(pLeft.val);
          pMerged.next.next = new ListNode(pLeft.val);
          pMerged = pMerged.next.next;
          pLeft = pLeft.next;
          pRight = pRight.next;
    
        } else {
          pMerged.next = new ListNode(pRight.val);
          pRight = pRight.next;
          pMerged = pMerged.next;
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
    // Generate a sample input [2, 3, 4, 3, 4]
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(4);
    ListNode n4 = new ListNode(3);
    ListNode n5 = new ListNode(4);
 
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
        
    // Merge sort the sample input
    n1 = mergeSortList(n1);
    
    // Print out result
    printList(n1);
  }
}
