public class MiddleoftheLInkedList {
    class Solution {
        public ListNode middleNode(ListNode head) {
            int half = countNode(head)/2;
            return moveNTime(head,half);
        }

        private int countNode(ListNode head) {
            int count = 0;
            while(head != null)
            {
                count++;
                head = head.next;
            }
            return count;
        }

        private ListNode moveNTime(ListNode node, int n){
            while(n != 0 && node != null)
            {
                node = node.next;
                n–;
            }
            return node;
        }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode middle = head;

            while(head != null && fast.nest != null)
            {
                fast = fast.next.next;
                middle = middle.next;
            }

            return middle;

        }
    }

}
