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
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head .next == null)
            return true;
        ListNode f = head, s = head;
        while(f!=null && f.next!=null)
        {
            f = f.next.next;
            s = s.next;
        }
        ListNode curr = s, prev  = null;
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode l = head, r = prev;
        while(r!=null)
        {
            if(l.val != r.val)
                return false;
            r = r.next;
            l = l.next;
        }
        return true;
    }
}