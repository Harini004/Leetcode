class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int i = 0,j= nums.size(),temp=0,mid =  0;
        while(i<j)
        {
             mid = (i+j)/2;
            if(nums[mid] < target)
            {
                temp = 1;
                i = mid+1;
            }
            else if(nums[mid]>target)
            {
                temp =0;
                j = mid;
            }
            else if(nums[mid]==target)
            {
                
                return mid;
            }
        }
       
        return i;
    }
};