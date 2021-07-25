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
    int c=0;
    public TreeNode inorder(TreeNode r,int k)
    {
        if(r==null) return null;
        TreeNode l=inorder(r.left,k);
        if(l!=null) return l;
        c++;
        if(c==k)
            return r;
            
        return inorder(r.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
       
       TreeNode res= inorder(root,k);
      
        return res.val;
    }
}
