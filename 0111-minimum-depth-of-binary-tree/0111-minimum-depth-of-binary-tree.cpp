/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int minDepth(TreeNode* root) {
        if(root==NULL)
        {
            return 0;
        }
        if(root->left ==NULL && root->right ==NULL)
            return 1;
        int l= INT_MAX,r=INT_MAX;
        if(root->left!=NULL)
          l=  minDepth(root->left)+1;
        if(root->right!=NULL)
          r=  minDepth(root->right)+1;
        return min(l,r);
    }
};