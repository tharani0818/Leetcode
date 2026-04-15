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
        int len1=getListLength(headA);
        int len2=getListLength(headB);

        while(len1>len2)
        {
            len1--;
            headA=headA.next;
        }
        while(len2>len1)
        {
            len2--;
            headB=headB.next;
        }
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    public int getListLength(ListNode head)
    {
        int l=0;
        while(head!=null)
        {
            l++;
            head=head.next;
        }
        return l;
    }
}