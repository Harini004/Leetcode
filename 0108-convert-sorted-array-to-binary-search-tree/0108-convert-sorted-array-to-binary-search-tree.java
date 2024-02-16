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
        return insert(null,nums,0,nums.length);
    }
    
    public TreeNode insert(TreeNode root,int[] nums,int l,int r)
    {
        if(l>=r)
            return null;
        int mid = (l+r)/2;
        root = new TreeNode(nums[mid]);
        root.left = insert(root,nums,l,mid);
        root.right = insert(root,nums,mid+1,r);
        return root;
    }
}