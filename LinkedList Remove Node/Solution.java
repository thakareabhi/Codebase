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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=new ListNode(0);
        slow.next=head;
        ListNode start=slow;

        ListNode rem=head;
        ListNode fast=head;

        if(head.next==null){
            return null;
        }

        for(int i=0;i<n;i++) {
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            rem=rem.next;
            slow=slow.next;
        }

        slow.next=rem.next;
        return start.next;
    }
}