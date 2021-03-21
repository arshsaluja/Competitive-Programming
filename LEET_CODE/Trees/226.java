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
//its the mirror image the swap left and right child
class Solution {
    public void swap(TreeNode cur)
    {
        if(cur==null)
            return ;
        swap(cur.left);
        swap(cur.right);
        TreeNode t;
        t=cur.left;
        cur.left=cur.right;
        cur.right=t;
    }
    public TreeNode invertTree(TreeNode root) {
       swap(root);
        return root;
    }
}
