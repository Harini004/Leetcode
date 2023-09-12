class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string out="";
        
        int l1 = 0,l2 =0,r1 = word1.size(),r2 = word2.size();
        while(l1< r1 || l2 < r2)
        {
          if(l1<r1)
              out.push_back(word1[l1++]);
            if(l2<r2)
                out.push_back(word2[l2++]);
        }
        return out;
    }
};