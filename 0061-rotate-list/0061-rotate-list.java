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
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (n >= count) {
            n = n % count;
        }
        if (n == 0 ) return head;
        ListNode t1 = head;
        ListNode t2 = head;
        int c = 0;
        while (t2.next != null) {
            if (c == n) {
                t1 = t1.next;
            } else {
                c++;
            }
            t2 = t2.next;
        }
        ListNode p1 = t1.next;
        while (p1.next != null) {
            p1 = p1.next;
        }
        p1.next = head;
        head = t1.next;
        t1.next = null;
        return head;
    }
}