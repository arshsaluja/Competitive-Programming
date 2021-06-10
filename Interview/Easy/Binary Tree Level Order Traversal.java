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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ll;
        q.add(root);
        
         int s=1;
        while(s!=0)
        {
            List<Integer> l=new ArrayList<>();
            
            for(int i=0;i<s;i++)
            {
             TreeNode t=q.poll();
            if(t.left!=null)
                q.add(t.left);
            if(t.right!=null)
                q.add(t.right);
           l.add(t.val); 
            }
            ll.add(l);
             s=q.size();
        }
        
        return ll;
    }
}
