class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);

        ListNode mid = getMiddle(head);
        TreeNode root = new TreeNode(mid.val);

        root.right = sortedListToBST(mid.next);
        mid.next =null;
        root.left = sortedListToBST(head);

        return root;
    }
    
    public ListNode getMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev!=null)prev.next =null;
        return slow;
    }
}




