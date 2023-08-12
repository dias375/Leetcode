package com.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if(head.next == null) return head;

        HashMap<Integer, Boolean> duplicateMap =  new HashMap<>();
        while(head.next != null){
            duplicateMap.put(head.val, true);
            head = head.next;
        }
        duplicateMap.put(head.val, true);

        List<Integer> resultKeys = duplicateMap.keySet().stream()
                .sorted()
                .collect(Collectors.toList());

        Stack<Integer> stack = new Stack<>();
        stack.addAll(resultKeys);

        return stackToListNode(stack);
    }

    private ListNode stackToListNode(Stack<Integer> stack){
        ListNode head = null;
        while(!stack.isEmpty()){
            head = new ListNode(stack.pop(), head);
        }
        return head;
    }


}
