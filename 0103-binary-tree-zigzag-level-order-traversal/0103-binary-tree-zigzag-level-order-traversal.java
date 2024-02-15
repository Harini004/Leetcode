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
 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
 	List<List<Integer>> ans = new ArrayList<>();
 	Deque<TreeNode> q = new LinkedList<>();
	if(root == null)
		return ans;
	Boolean reverse = false;
 	q.offer(root);
 	while(!q.isEmpty())
	{
		int level = q.size();
		List<Integer> curres = new ArrayList<>();
		for(int i =0;i<level;i++)
		{
			if(reverse == false)
			{

				TreeNode curr = q.pollFirst();
				curres.add(curr.val);
				if(curr.left!=null)
					q.offerLast(curr.left);
				if(curr.right!=null)
					q.offerLast(curr.right);
			}
			else
			{

				TreeNode curr = q.pollLast();
				curres.add(curr.val);
				if(curr.right!=null)
					q.offerFirst(curr.right);
				if(curr.left!=null)
					q.offerFirst(curr.left);
			}
			
		}
		reverse = !reverse;
		ans.add(curres);
	}
	return ans;
}
}