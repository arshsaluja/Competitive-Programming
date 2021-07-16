/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <Integer> a=new ArrayList<>();
       List<List<Integer>> b=new ArrayList<>();
        if(root==null) return b;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        a.add(root.val);
        b.add(a);
        int c=1;
        while(!q.isEmpty())
        {
             a=new ArrayList<>();
            int p=q.size();
            if(c%2!=0)
            {
                 for(int i=0;i<p;i++)
            {
            TreeNode t=q.peekFirst();
            q.removeFirst();
            if(t.right!=null)
            {
                a.add(t.right.val);
                q.add(t.right);
                }
            if(t.left!=null)
                {
                      a.add(t.left.val);
                      q.add(t.left);
                }   
             }   
            }
            else
            {
            for(int i=0;i<p;i++)
            {
                
            TreeNode t=q.peekLast();
                q.removeLast();
                 if(t.left!=null)
                {
                a.add(t.left.val);
                q.addFirst(t.left);
                }
            
            if(t.right!=null)
               {
                a.add(t.right.val);
                q.addFirst(t.right);
                }
            }
            }
          if(a.size()>0)
           {
               b.add(a);
               c++;
           }
        }
        return b;
    }
}
