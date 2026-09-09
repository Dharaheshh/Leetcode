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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        int n = 1;
        ListNode t = head;
        while (t.next != null) {
            t = t.next;
            n++;
        }
        k%=n;
        if(k==0) return head;
       // return head;
        t.next = head;
        ListNode end = head;
        for(int i=1;i<n-k;i++) end = end.next;
        ListNode start = end.next;
        end.next = null;
        return start;
    }
}