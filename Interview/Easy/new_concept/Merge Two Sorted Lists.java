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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode r=new ListNode(0);
        ListNode a=l1;
        ListNode b=l2;
        ListNode res=r;
        while(true)
        {
            if(a==null)
            {
               res.next=b;
                break;
            }
            if(b==null)
            {
                res.next=a;
                break;
            }
            if(a.val<=b.val)
            {
                res.next=a;
                a=a.next;
            }
            else
            {
                res.next=b;
                b=b.next;
            }
            res=res.next;
        }
        return r.next;
    }
}
