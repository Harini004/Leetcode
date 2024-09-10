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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
      int[][] out = new int[m][n];
      for(int[] row: out)
          Arrays.fill(row, -1);
        int[][] directions = {{0,1},  { 1, 0 },
            { 0, -1 },
            { -1, 0 }};
        int i =0,j=0,current=0;
        while(head!=null)
        {
            out[i][j] = head.val;
            int newi = i+directions[current][0], newj = j+directions[current][1];
            if(newi<0 || newj<0|| newi>=m || newj>=n || out[newi][newj]!=-1)
            {
                current = (current+1)%4;
            }
            i = i+directions[current][0]; 
            j = j+directions[current][1];
            head = head.next;
        }
        return out;
    }
}