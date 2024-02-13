/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
  1->2->3->4->null
  
  
p c n
  p c
 prev = null
 
 next = c->next
 c->next = prev
 p = c
 c = n
 
 
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null,curr = head,next = head;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}