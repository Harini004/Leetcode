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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head,prev = head;
        int c = 0;
        
        while(curr!=null)
        {
            
            curr = curr.next;
            c++;
        }
        curr = head;
        if(c==1 && n==1)
            return null;
         
       if(c-n==0)
           return head.next;
        while(c-n!=0)
        {
            prev = curr;
            curr = curr.next;
            // System.out.println("c value");
            // System.out.println(c);
            c--;
           // System.out.println(curr.val);
        }
     //   System.out.println(curr.next.val);
        prev.next = curr.next;
        return head;
        
    }
}