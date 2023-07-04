package com.leetcode;

public class Main {
    public static void main(String[] args) {
        var run = new RemoveDuplicatesFromSortedListTwo();

//        ListNode AAAAAAA = new ListNode(5, null);
//        ListNode AAAAAA = new ListNode(4, AAAAAAA);
//        ListNode AAAAA = new ListNode(4, AAAAAA);
//        ListNode AAAA = new ListNode(3, AAAAA);
//        ListNode AAA = new ListNode(3, AAAA);
        ListNode AA = new ListNode(1, null);
        ListNode A = new ListNode(1, AA);

        System.out.println(run.deleteDuplicates(A));

    }
}