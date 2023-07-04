package com.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class RemoveDuplicatesFromSortedListTwo {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        Stack<Integer> nonDuplicateStack = nonDuplicateStack(head);
        if(nonDuplicateStack.isEmpty()) return null;
        return stackToListNode(nonDuplicateStack);
    }

    private ListNode stackToListNode(Stack<Integer> stack){
        ListNode head = new ListNode();
        ListNode next = null;
        while(!stack.isEmpty()){
            head = new ListNode(stack.pop(), next);
            next = head;
        }
        return head;
    }

    private Stack<Integer> nonDuplicateStack(ListNode head){
        Stack<Integer> nonDuplicateStack = new Stack<>();
        HashMap<Integer, Boolean> isNodeDuplicateMap = isNodeDuplicate(head);
        do {
            if(!isNodeDuplicateMap.get(head.val)) nonDuplicateStack.push(head.val);
            head = head.next;
        } while (head != null);
        return  nonDuplicateStack;
    }

    private HashMap<Integer, Boolean> isNodeDuplicate(ListNode node) {
        HashMap<Integer,Boolean> isNodeDuplicateMap = new HashMap<>();
        while(node != null){
            if(isNodeDuplicateMap.containsKey(node.val)){
                isNodeDuplicateMap.put(node.val,true);
            }
            else{
                isNodeDuplicateMap.put(node.val,false);
            }
            node=node.next;
        }
        return isNodeDuplicateMap;
    }

}