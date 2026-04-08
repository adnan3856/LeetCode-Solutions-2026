class SolutionRecursion {
    public ListNode reverseList(ListNode head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }
        
        // Recursively reverse the rest of the list
        ListNode newHead = reverseList(head.next);
        
        // Reverse the current node's pointer
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
}
