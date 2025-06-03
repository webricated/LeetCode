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
    public ListNode removeElements(ListNode head, int val) {
        // Because head is traversing/checking val/returning head together : Base Case
        if(head == null) return null;
        ListNode newList = removeElements(head.next, val);
        // Skip this node if val matches
        if(head.val == val) return newList;
        // Include in the list or do not skip if val doesn't matches
        else head.next = newList;
        // Returning head because head is used to traverse here
        return head;
    }
}