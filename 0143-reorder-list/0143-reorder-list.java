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
public ListNode findmid(ListNode head)
{
	ListNode f = head, s = head;
	while(f!=null && f.next!=null)
	{
		f = f.next.next;
		s = s.next;
	}
    System.out.println("mid:"+ s.val);
	return s;
}
  public ListNode reverse(ListNode mid)
    {
        ListNode prev = null;
        ListNode present = mid;
        ListNode then = present.next;
        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = then;
            if(then != null)
            then = then.next;
             System.out.println("PREV:"+ prev.val);
        }
        return prev;
    }
public void reorderList(ListNode head) 
{
    if(head == null || head.next == null)
         return ;
	ListNode mid = findmid(head);
	ListNode h2 = reverse(mid);
	ListNode h1 = head;

	while(h1!=null && h2!=null)
	{
		ListNode temp = h1.next;
		h1.next = h2;
		h1 = temp;
		
		temp = h2.next;
		h2.next = h1;
		h2 = temp;
	}
	if(h1!=null)
		h1.next = null;

}
     
}