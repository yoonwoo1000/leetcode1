public class LinkedList21_09_30 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            ListNode a = headA, b = headB;
            while(a != null) {
                if(b == null) {
                    b = headB;
                    a = a.next;
                } else if (a == b) {
                    return a;
                } else {
                    b = b.next;
                }
            }
            return null;
        }
    }

1 2 3 4 5 -> null

        2 3 4 5


        import java.util.*;
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            HashSet<ListNode> set = new HashSet<>();
            ListNode a = headA;
            while(a != null){
                set.add(a);
                a = a.next;
            }
            while(b != null){
                if(set.contains(b)){
                    return b;
                }
                b = b.next;
            }
            return null;
        }
    }



    // JW
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA, b = headB;

            while(a != null || b != null){
                if(a == null) a = headB;
                else if(b == null) b = headA;
                else if(a == b) return a;
                else{
                    a = a.next;
                    b = b.next;
                }
            }
            return null;
        }
    }
    // YW
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null) return null;
            ListNode a = headA, b = headB;

            while(a != b) {

                if(a == null && b == null) {
                    return null;
                } else if(a == null) {
                    a = headB
                } else if(b == null) {
                    b = headA
                } else {
                    a = a.next;
                    b = b.next;
                }


                // b null? -> b->

                // a, b

            }

            return a
        }
    }
    // JE
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA, b = headB;
            while(a != null || b != null){
                if(a == b) {
                    return a;
                } else if (a == null){
                    a = headB;
                } else if (b == null){
                    b = headA;
                } else {
                    a = a.next;
                    b = b.next;
                }
            }
            return null;
        }
    }



}
