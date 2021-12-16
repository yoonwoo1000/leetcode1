public class RemoveLinkedList {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1, head);
            ListNode curr = dummy;
            while(curr.next != null) {
                if(curr.next.val == val){
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }
    class Solution {
        public ListNode removeElements(ListNode head, int val) {

        }
    }


    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1,head);
            ListNode curr = dummy
            while(curr.next != null)
            {
                if (curr.next.val == val) // curr.next check
                {
                    curr.next = curr.next.next; // fix
                } else {
                    curr = curr.next;
                }
            }
            return dummy.next;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1, head);
            ListNode curr = dummy;
            while(curr.next != null){
                if(curr.next.val == val) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            return dummy.next;

        }}




}
