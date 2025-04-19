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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        // Check if there are at least k nodes to reverse
        ListNode node = head;
        int count = 0;
        while (count < k && node != null) {
            node = node.next;
            count++;
        }
        
        // If we have k nodes, then we reverse them
        if (count == k) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode next = null;
            int i = 0;
            while (i < k && curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                i++;
            }
            // Recur for the remaining list and connect
            head.next = reverseKGroup(next, k);
            return prev;  // New head of this k-group
        }

        // Less than k nodes, return head as is
        return head;
    }

   
}