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
    public ListNode reverseList(ListNode head) {
        Stack<Integer>s=new Stack<>();
        while(head!=null)
        {
            s.push(head.val);
            head=head.next;
        }
        ListNode l=new ListNode(Integer.MIN_VALUE);
        ListNode ptr=l;
        while(!s.isEmpty())
        {
            ptr.next=new ListNode(s.pop());
            ptr=ptr.next;
        }
        return l.next;
    }
}