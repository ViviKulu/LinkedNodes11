package com.company;

import java.util.LinkedList;

public class Main {

    // Write the code necessary to convert the following sequences of ListNode objects:
    //
    //  list -> [1] -> [2] /
    //  temp -> [3] -> [4] /
    //  Into this sequence of ListNode objects:
    //
    //  list -> [1] -> [3] -> [4] -> [2] /
    //  (It does not matter what temp refers to at the end of your code.)
    //
    //  Assume that you are using ListNode class as defined in the textbook:
    //
    //  public class ListNode {
    //    public int data;       // data stored in this node
    //    public ListNode next;  // a link to the next node in the list
    //
    //    public ListNode() { ... }
    //    public ListNode(int data) { ... }
    //    public ListNode(int data, ListNode next) { ... }
    //  }

    public static void main(String[] args) {
	// write your code here
    // objective: insert temp list into list list after the head node.
        ListNode listNodeOne = new ListNode(1);
        ListNode listNodeTwo = new ListNode(2);

        LinkedIntList finalList = new LinkedIntList("list");

        ListNode listNodeThree = new ListNode(3);
        ListNode listNodeFour = new ListNode(4);

        LinkedIntList tempList = new LinkedIntList("temp");

        finalList.add(listNodeOne.data);
        finalList.add(listNodeTwo.data);

        tempList.add(listNodeThree.data);
        tempList.add(listNodeFour.data);

        for(int i = 0; i < tempList.size(); i++){
            finalList.add(finalList.size() - 1, tempList.get(i));
        }
        System.out.println(finalList);

    }
}
