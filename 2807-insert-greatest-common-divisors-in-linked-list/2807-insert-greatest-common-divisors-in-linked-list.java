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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node1 = head, node2 = head.next;
        while(node2!=null)
        {
            int gcdVal = calcgcd(node1.val,node2.val);
            ListNode gcd = new ListNode(gcdVal);
            node1.next = gcd;
            gcd.next = node2;
            
            node1 = node2;
            node2 = node2.next;
        }
        return head;
    }
    private int calcgcd(int a, int b)
    {
        while(b!=0)
        {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}