class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
   //      char[] ch = magazine.toCharArray();
        for(char c:magazine.toCharArray())
        {
            if(!hm.containsKey(c))
                hm.put(c,1);
            else
                hm.put(c,hm.get(c)+1);
        }
        for(char rn:ransomNote.toCharArray())
        {
            if(!hm.containsKey(rn) || hm.get(rn)==0)
                 return false;
            else
                hm.put(rn,hm.get(rn)-1);
            
        }
        return true;
    }
}