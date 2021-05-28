/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode t=node;
         while(node.next!=null)
         {
             t=node;
             node.val=node.next.val;
             node=node.next;
             
         }
         t.next=null;
    }
}
