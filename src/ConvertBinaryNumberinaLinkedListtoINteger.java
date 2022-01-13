public class ConvertBinaryNumberinaLinkedListtoINteger {

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
        public int getDecimalValue(ListNode head) {

            int num = 0;

            ListNode curr = head;
            while(curr != null) {
                num = num * 2 + curr.val;
                curr = curr.next;
            }
            return num;
        }
    }




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
        public int getDecimalValue(ListNode head) {
            int sum = 0;
            while(head != null) {
                if(head.next != null) {
                    sum = (sum + head.val) * 2;
                } else {
                    sum = sum + head.val;
                }
            }
            return sum;
        }
    }



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
        public int getDecimalValue(ListNode head) {
            ListNode newHead = reverse(head);
            int sum = 0;
            int currNum = 1;
            while(newHead != null) {
                sum += currNum * newHead.val;
                currNum *= 2;
                newHead = newHead.next;
            }
            return sum;
        }

        private ListNode reverse(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode next = null;
            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        }
return prev;
    }



    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head != null) {
            sum = (sum << 1) | head.val;
            head = head.next;
        }
        return sum;
    }

}
