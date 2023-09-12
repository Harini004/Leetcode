class Solution {
public:
    bool canPlaceFlowers(vector<int>& fb, int n) {
        int count =0;
        for(int i = 0;i<fb.size();i++)
        {
            if(fb[i]==0)
            {
            bool emptyL = (i==0) || (fb[i-1] == 0);
            bool emptyR = (i==fb.size()-1) || (fb[i+1] == 0);
            if(emptyL && emptyR)
            {
                fb[i] = 1;
                count++;
            }
        }
        }
        return count>=n;
    }
};