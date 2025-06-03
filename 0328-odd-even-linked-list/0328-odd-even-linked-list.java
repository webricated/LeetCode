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
    public ListNode oddEvenList(ListNode head) {
        // More than one node should be available, otherwise
        if(head == null || head.next == null) return head;
        
        ListNode odd  = head;
        ListNode even = head.next;
        // Odds end needed to be connected to the evenHead
        ListNode evenHead = even;

        while(even != null && even .next != null){
            // Connnect all odds
            odd.next = even.next;
            odd = odd.next;
            // Connect all even
            even.next = odd.next;
            even = even.next;
        }
        // Connect odds end to the evenHead
        odd.next = evenHead;

        return head;
    }
}

