class Solution {
public:
    string reverseStr(string s, int k) {
        int i = 0,j= s.size();
        if(k==1)
            return s;
        while(i<s.size())
        {
            if(j<=k)
                reverse(s.begin()+i,s.end());
            else
                reverse(s.begin()+i,s.begin()+k+i);
            i = i+2*k;
            j-=2*k;
        }
        return s;
    }
};

