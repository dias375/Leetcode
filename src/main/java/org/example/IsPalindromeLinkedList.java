package org.example;

public class IsPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        StringBuilder digits = new StringBuilder();
        do {
            digits.append(head.val);
            head = head.next;
        } while (head != null);
        String reverseDigits = new StringBuilder(digits).reverse().toString();
        return digits.toString().equals(reverseDigits.toString());
    }
}
