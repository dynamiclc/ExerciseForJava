package main;

import problem.mergesort.*;
import datastructure.listnode.*;

public class Main {
  public static void main(String[] args) {
	// PROBLEM Merge-sort Linked List
    MergeSortLinkedList();
    
    // PROBLEM Two Sum
    TwoSum();
  }
  
  public static void MergeSortLinkedList() {
	System.out.println("==============================\n");
	System.out.println("PROBLEM Merge-sort Linked List\n");
	System.out.println("==============================\n");
	
	// Generate a sample input [4, 2, 5, 3, 6]
	System.out.println("Generate a sample input [4, 2, 5, 3, 6]\n");
    ListNode nodeFirst = new ListNode(4);
    ListNode nodeSecond = new ListNode(2);
    ListNode nodeThird = new ListNode(5);
    ListNode nodeFourth = new ListNode(3);
    ListNode nodeFifth = new ListNode(6);
    
    nodeFirst.next = nodeSecond;
    nodeSecond.next = nodeThird;
    nodeThird.next = nodeFourth;
    nodeFourth.next = nodeFifth;
    nodeFifth.next = null;
        
    // Merge sort the sample input
    nodeFirst = MergeSortLinkedList.mergeSortList(nodeFirst);
    
    // Print out result
    MergeSortLinkedList.printList(nodeFirst);
	
	System.out.println("\n\n");
  }
  
  public static void TwoSum() {
	System.out.println("===============\n");
	System.out.println("PROBLEM Two Sum\n");
	System.out.println("===============\n");
	
	// Generate a sample input
	// numbers={2, 7, 11, 15}, target=9
	System.out.println("Generate a sample input\n");
    System.out.println("numbers={2, 7, 11, 15}, target=9\n");
        
    // Merge sort the sample input
    
    // Print output
    
	System.out.println("\n\n");
  }
}
