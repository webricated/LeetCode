/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half (slow onwards will be reversed)
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        ListNode second = secondHalf;
        while (second != null) {
            if (firstHalf.val != second.val) return false;
            firstHalf = firstHalf.next;
            second = second.next;
        }

        // Optional Step 4: Restore the list
        // reverseList(secondHalf);

        return true;
    }

    // Reverse helper
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }
}
