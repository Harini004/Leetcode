class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size(),s=-1,e=-1;
        for(int i =0;i<n;i++)
            
        {
            if(nums[i]==target)
            {
                s=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                e=i;
                break;
            }
        }
        return {s,e};
    }
};