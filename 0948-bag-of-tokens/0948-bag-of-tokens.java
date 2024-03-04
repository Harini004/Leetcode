class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int l = 0,r = tokens.length-1;
        int score = 0;
        Arrays.sort(tokens);
        while(l<=r)
        {
            if(power >= tokens[l])
            {
                power -= tokens[l];
                l++;
                score += 1;
            }
            else if(score >0 && l<r)
            {
                power += tokens[r];
                r--;
                score -= 1;
            }
            else
                return score;
        }
        return score;
    }
}