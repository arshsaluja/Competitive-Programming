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
    public ListNode reverse(ListNode h)
    {
        ListNode cur=h;
        ListNode prev=null;
        ListNode t=null;
        while(cur!=null)
        {
            t=cur.next;
            cur.next=prev;
            prev=cur;
            cur=t;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null)
            return true;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow);
        ListNode r=head;
        while(rev!=null&&r!=null)
        {
            if(rev.val!=r.val)
            {
                return false;
            }
            rev=rev.next;
            r=r.next;
            
        }
        return true;
    }
}
