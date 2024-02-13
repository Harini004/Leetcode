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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head,prev = null;
        for(int i = 0;i<left-1 && curr!=null;i++)
        {
            prev = curr;
            curr = curr.next;
        
        }
         
        ListNode newEnd =curr,last = prev; 
         ListNode next = curr.next;
        for(int i = 0;i<right-left+1 && curr!=null;i++)
        {
          
            curr.next = prev;
            prev = curr;
            curr  = next;
         if(next!=null)
             next = next.next;
        }
        if(last!=null)
        {
            last.next = prev;
        }
        else
            head = prev;
        newEnd.next = curr;
        return head;
            
    }
}