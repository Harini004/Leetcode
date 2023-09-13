class Solution {
public:
    bool isvowel(char &ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||                   ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ;
    }
    string reverseVowels(string s) {
       
        int i = 0,j = s.length()-1;
        while(i<j)
        {
            if(!isvowel(s[i]))
                i++;
            
           else if(!isvowel(s[j]))
                j--;
            else
            {
                swap(s[i],s[j]);
                i++;
                j--;
            }
                                                                                      }
        
        return s;
    }
                                                                                      
};