class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        ans = []
        q = deque(range(1,10))
        while q:
            n = q.popleft()
            if n> high:
                continue
            if low<=n<=high:
                ans.append(n)
            ones = n%10
            if ones<9:
                q.append((10*n)+(ones+1))
        return ans