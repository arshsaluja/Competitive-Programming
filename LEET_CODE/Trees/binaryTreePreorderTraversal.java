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
    public void recurse(TreeNode root,List<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        recurse(root.left,arr);
        recurse(root.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> arr=new ArrayList<>();
        if(root==null) return arr;

        recurse(root,arr);
        return arr;
    }
}
