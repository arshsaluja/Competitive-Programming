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
    ArrayList<Integer> a=new ArrayList<>();
    
    public void inorder(TreeNode r)
    {
        if(r==null) return ;
        inorder(r.left);
        a.add(r.val);
            
        inorder(r.right);
    }
    public int kthSmallest(TreeNode root, int k) {
       // if(root==null) return 0;
        inorder(root);
       System.out.println(a.size());
        for(int m=0;m<a.size();m++)
        {
            System.out.println(a.get(m));
            if(k==1)
                return a.get(m);
            k--;
        }
        return 0;
    }
}
