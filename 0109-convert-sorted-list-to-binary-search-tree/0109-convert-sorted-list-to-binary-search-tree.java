/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val);
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null &&fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode res = new TreeNode(slow.next.val);
        ListNode rh = slow.next.next;
        slow.next = null;
        res.right = sortedListToBST(rh);        
        res.left = sortedListToBST(head);
        return res;
    }
}