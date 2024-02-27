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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
    
            q1.offer(p);
            q1.offer(q);
        
        while(!q1.isEmpty())
        {
            TreeNode first = q1.poll();
            TreeNode second = q1.poll();
            if(first == null && second == null)
                continue;
            if(first == null || second == null)
                return false;
            if(first.val != second.val)
                return false;
            q1.offer(first.left);
            q1.offer(second.left);
            q1.offer(first.right);
            q1.offer(second.right);
        }
        return true;
        
    }
}