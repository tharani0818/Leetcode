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
    public ListNode deleteMiddle(ListNode head) {
        ListNode h1=head,h2=head;
        int c=0;
        while(head==null || head.next==null)
        {
            return null;
        }
        while(h1!=null)
        {
            c=c+1;
            h1=h1.next;
        }
        int n=c/2;
        for(int i=0;i<n-1;++i)
        {
            h2=h2.next;
        }
        h2.next=h2.next.next;
        return head;
    }
}