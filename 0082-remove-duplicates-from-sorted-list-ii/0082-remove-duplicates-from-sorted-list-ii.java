class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0, head);
        ListNode prev = temp;

        while (head != null) {
            // If duplicate sequence
            if (head.next != null && head.val == head.next.val) {
                // Skip all duplicates
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Skip the entire group
                prev.next = head.next;
            } else {
                // No duplicate, move prev
                prev = prev.next;
            }
            head = head.next;
        }

        return temp.next;
    }
}
