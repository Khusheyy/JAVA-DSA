public class middle_linkedlist {
    public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // in order to find the middle of linked list (even or odd) , we use slow pointer and fast pointer
    public ListNode middleNode(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null){
            slow_ptr = slow_ptr.next;//slow pointer moves 1 step at a time
            fast_ptr = fast_ptr.next.next;// fast pointer moves twice as fast
        }

        return slow_ptr;
    }

    // the same code for linked list cycle detection , where in you detect a cycle when both slow_ptr and fast_ptr are equal

}
