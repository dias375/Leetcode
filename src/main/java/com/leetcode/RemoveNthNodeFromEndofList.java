package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ArrayList<ListNode> nodeList = nodeListToArray(head);
        Collections.reverse(nodeList);
        ListNode interestNode = nodeList.get(n-1);
        if(nodeList.get(n-1).next.next != null){
            interestNode = new ListNode(nodeList.get(n-1).val, nodeList.get(n-1).next.next);
        } else{
            interestNode = new ListNode(nodeList.get(n-1).val);
        }

        return head;
    }

    private ListNode openNode(ListNode head){
        return head.next;
    }

    private ArrayList<ListNode> nodeListToArray(ListNode head){
        ListNode nextNode = head;
        ArrayList<ListNode> nodeList = new ArrayList<>();
        do{
            nodeList.add(nextNode);
            nextNode = openNode(nextNode);
        } while(nextNode != null);
        return nodeList;
    }
}
