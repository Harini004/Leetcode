class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int,int> m1,m2;
        for(int i: arr)
        {
            m1[i]++;
        }
        for(auto i : m1)
        {
            m2[i.second]++;
            if(m2[i.second]>1)
                return 0;
        }
        return 1;
    }
};