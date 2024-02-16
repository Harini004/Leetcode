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
    public boolean sym(TreeNode r1, TreeNode r2)
    {
        if(r1==null && r2== null)
            return true;
        if((r1!=null && r2!=null) &&(r1.val == r2.val))
            return sym(r1.right,r2.left) && sym(r1.left,r2.right);
        return false;
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(sym(root,root))
            return true;
        return false;
    }
}