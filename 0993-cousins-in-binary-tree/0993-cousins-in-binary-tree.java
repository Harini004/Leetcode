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
public boolean isCousins(TreeNode root, int x, int y) {
	TreeNode xx = findnode(root,x);
	TreeNode yy = findnode(root,y);
	
	return ( (level(root,xx,0) == level(root,yy,0)) && (!Siblings(root,xx,yy))
); 
    }

TreeNode findnode(TreeNode root, int x)
{
	if(root == null)
		return null;
	if(root.val == x)
		return root;
	TreeNode n = findnode(root.left,x);
	if(n!=null)
		return n;
	return findnode(root.right,x);
}

boolean Siblings(TreeNode root,TreeNode x,TreeNode y)
{
	if(root == null)
		return false;
	return (((root.left == x) && (root.right == y)) || ((root.left == y) && (root.right == x))||
(Siblings(root.left,x,y) ||(Siblings(root.right,x,y)))
);
}

int level(TreeNode root, TreeNode x, int lev)
{
	if(root == null)
		return 0;
	if(root == x)
		return lev;
	int n = level(root.left,x,lev+1);
	if(n!=0)
		return n;
	return level(root.right,x,lev+1);
}

}