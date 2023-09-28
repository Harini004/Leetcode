class Solution {
public:
    int peakindex(vector<int>& nums)
    {
        int l = 0,r = nums.size()-1,mid=0;
        while(l<r)
        {
             mid = (l+r)/2;
       //     cout<<"mid is: "<<mid;
            if(nums[mid]>nums[mid+1])
            {
               // cout<<nums[mid];
                return mid;
            }
            if(nums[mid-1]>nums[mid])
            {
                //cout<<nums[mid-1];
                return mid-1;
            }
            if(nums[mid]<nums[l])
                r = r-1;
            if(nums[mid]>nums[l])
                l = mid;
        }
       // cout<<"peak is: "<<mid<<"\n";
        return mid;
       
    }
    int bs(vector<int>& nums,int l,int r,int t)
    {
      int mid;
        while(l<=r)
        {
              mid = (l+r)/2;
          
           if(nums[mid]<t)
                l = mid+1;
          if(nums[mid]>t)
                r = mid-1;
            cout<<nums[mid]<<" mid "<<t<<" tar "<<"\n"<<l<<" l "<<r<<" r "<<"\n";
            
              if(nums[mid] == t)
                return mid;
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
       int i=0,j=nums.size();
        if(nums[0]<nums[j-1])
            return bs(nums,0,nums.size()-1,target);
     //   cout<<"calling peak ";
        int peaki= peakindex(nums);
     //   cout<<"peak is "<<peaki<<"\n";
        cout<<"calling fs ";
        int fs = bs(nums,0,peaki,target);
        cout<<"fs is: "<<fs<<"\n";
        cout<<"calling ss ";
        int ss = bs(nums,peaki+1,nums.size()-1,target);
         cout<<"ss is: "<<ss<<"\n";
        if(fs !=-1)
            return fs;
      
        return ss;
    }
};