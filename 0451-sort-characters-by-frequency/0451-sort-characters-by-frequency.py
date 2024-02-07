class Solution:
    def frequencySort(self, s: str) -> str:
        c = Counter(s)
        bucket = defaultdict(list)
        
        for char,cnt in c.items():
            bucket[cnt].append(char)
        res = []
        for i in range(len(s),0,-1):
            for val in bucket[i]:
                res.append(val*i)
        return "".join(res)