class Solution {
public:
    string reverseStr(string s, int k) {
        int start = 0,end=k-1;
        char temp;
       while(start<s.size())
        {
           if(end>=s.size()) end = s.size()-1;
           int l = start;
           while(start<=end)
           {
             
            char temp = s[start];
           s[start++] = s[end];
           s[end--] = temp;
           }
           start =l+ 2*k;
           end = start+k-1;
        }
        return s;
    }
};

