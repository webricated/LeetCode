class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}



// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if (head == null || head.next == null) return head;

//         ListNode first = head;
//         ListNode second = head.next;

//         // Swap
//         first.next = swapPairs(second.next);
//         second.next = first;

//         return second;
//     }
// }
