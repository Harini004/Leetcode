/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
       int count = 0,len=0;
        ListNode* temp = head;
        ListNode* curr = head;
        while(temp!=NULL)
        {
            temp = temp->next;
            len++;   
        }
     if(curr==NULL)
            return 0;
         count = len - (k%len);
        int i=1;
        while(i<=count-1 && curr!=NULL)
        {
            curr = curr->next;
            i++;
        }
       
        ListNode* kth = curr;
        while(curr->next!=NULL)
            curr = curr->next;
        curr->next = head;
        head = kth->next;
        kth->next = NULL;
        cout<<count;
        return head;
    }
};