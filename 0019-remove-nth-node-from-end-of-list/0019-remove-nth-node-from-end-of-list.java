class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = new ListNode(0, head);
        ListNode second = first;
        ListNode temp = first;
        for(int i = 1; i <= n; i++){
            first = first.next;
        }
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return temp.next;
    }
}