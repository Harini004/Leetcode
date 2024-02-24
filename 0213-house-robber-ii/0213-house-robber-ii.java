class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        if(n ==2)
            return Math.max(nums[0],nums[1]);
       
        int h1 = helper(nums,0,n-2);
        int h2 = helper(nums,1,n-1);
        return Math.max(h1,h2);
    }
        public int helper(int[] nums,int s,int e)
        {
            int[] dp = new int[nums.length];
            dp[s] = nums[s];
            
             dp[s+1] = Math.max(nums[s],nums[s+1]);
            for(int i=s+2;i<=e;i++)
            {
                dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
        return dp[e];
        }
}