class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0)
            return 0;
        int i;
        for(i = 0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]!=1)
                return nums[i]+1;

        }
                    if(i==nums.length-1)
           return nums[i]+1;
        return 0;
    }
}