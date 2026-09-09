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
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        ListNode f = head;
        for (int i = 1; i < k; i++) f = f.next;
        ListNode s = head;
        for (int i = 1; i <= n - k; i++) s = s.next;
        int x = s.val;
        s.val  = f.val;
        f.val = x;
        return head;
    }
}