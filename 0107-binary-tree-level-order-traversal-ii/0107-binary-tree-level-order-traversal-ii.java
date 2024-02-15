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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
 	Deque<TreeNode> q = new LinkedList<>();
	if(root == null)
		return ans;
 	q.offer(root);
 	while(!q.isEmpty())
	{
		int level = q.size();
		List<Integer> curres = new ArrayList<>();
		for(int i =0;i<level;i++)
		{
		

				TreeNode curr = q.poll();
				curres.add(curr.val);
				if(curr.left!=null)
					q.offer(curr.left);
				if(curr.right!=null)
					q.offer(curr.right);
			
		}
		ans.add(0,curres);
	}
	return ans;
    }
}