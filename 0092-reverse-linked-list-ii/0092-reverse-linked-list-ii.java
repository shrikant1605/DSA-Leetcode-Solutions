class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevLeft = dummy;
        
        for (int i = 0; i < left - 1; i++) {
            prevLeft = prevLeft.next;
        }
        
        ListNode leftNode = prevLeft.next;
        ListNode curr = leftNode;
        ListNode prev = prevLeft;
        
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        prevLeft.next = prev;     
        leftNode.next = curr;     
        
        return dummy.next;
    }
}