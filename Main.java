package main;

import problem.mergesort.*;
import problem.twosum.*;
import datastructure.listnode.*;

public class Main {
  public static void main(String[] args) {
	// PROBLEM Merge-sort Linked List
    MergeSortLinkedList();
    
    // PROBLEM Two Sum
    TwoSum();
  }
  
  public static void MergeSortLinkedList() {
	System.out.println("==============================");
	System.out.println("PROBLEM Merge-sort Linked List");
	System.out.println("==============================");
	
	// Generate a sample input [4, 2, 5, 3, 6]
	System.out.println("Generate a sample input [4, 2, 5, 3, 6]");
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
	
	System.out.println("");
  }
  
  public static void TwoSum() {
	System.out.println("===============");
	System.out.println("PROBLEM Two Sum");
	System.out.println("===============");
	
	// Generate a sample input
	// numbers={2, 3, 3, 2, 4, 1}, target=5
	System.out.println("Generate a sample input");
    System.out.println("numbers={2, 3, 3, 2, 4, 1}, target=5");
    int[] intArrayTwoSum = new int[7];
    intArrayTwoSum[0] = 2;
    intArrayTwoSum[1] = 3;
    intArrayTwoSum[2] = 3;
    intArrayTwoSum[3] = 2;
    intArrayTwoSum[5] = 4;
    intArrayTwoSum[6] = 1;
    
    int targetTwoSum = 5;
    
    // Calculate two sum 
    int[] resultTwoSum = new int[2];
    resultTwoSum = TwoSum.twoSum(intArrayTwoSum, targetTwoSum);
    
    // Print output    
    System.out.println("The result is index1=" + resultTwoSum[0] + ", index2="
                       + resultTwoSum[1]);
	System.out.println("");
  }
}
