class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int maxC = 0;
        for(int candy:candies)
        {
            maxC = max(maxC,candy);
        }
        vector<bool> res;
        for(int candy: candies)
        {
            res.push_back(candy+ extraCandies >= maxC);
        }
        return res;
    }
};