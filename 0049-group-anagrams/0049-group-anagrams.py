class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        count = defaultdict(list)
        for c in strs:
            sorted_word = ''.join(sorted(c))
            count[sorted_word].append(c)
                
        return count.values()    