package com.leetcode;

import java.util.ArrayList;

public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode nextNode = head;
        ArrayList<ListNode> nodeList = new ArrayList<>();
        do{
            nodeList.add(nextNode);
            nextNode = openNode(nextNode);
        } while(nextNode != null);

        return nodeList.get(nodeList.size()/2);
    }

    private ListNode openNode(ListNode head){
        return head.next;
    }
}