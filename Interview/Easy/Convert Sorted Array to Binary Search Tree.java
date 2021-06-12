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
    public TreeNode sortedArrayToBST(int[] nums) {
         if(nums.length==0) return null;
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int nums[],int left,int right)
    {
       
        if(left>right) return null;
        int mid=left+(right-left)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left=helper(nums,left,mid-1);
        n.right=helper(nums,mid+1,right);
        return n;
    }
}
