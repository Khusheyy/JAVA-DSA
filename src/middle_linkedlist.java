public class middle_linkedlist {
   public middle_linkedlist.ListNode middleNode(middle_linkedlist.ListNode head) {
      middle_linkedlist.ListNode slow_ptr = head;

      for(middle_linkedlist.ListNode fast_ptr = head; fast_ptr != null && fast_ptr.next != null; fast_ptr = fast_ptr.next.next) {
         slow_ptr = slow_ptr.next;
      }

      return slow_ptr;
   }
}
