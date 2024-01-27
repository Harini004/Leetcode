class Solution:
    def kInversePairs(self, n: int, k: int) -> int:
        MOD = 10**9 + 7
        prev = [0] * (k+1)
        prev[0] = 1
        for N in range(1,n+1):
            cur = [0] * (k+1)
            tot = 0
            for K in range(0,k+1):
                if K >= N:
                    tot -= prev[K-N]
                tot = (tot+ prev[K]) % MOD
                cur[K] = tot
            prev = cur
        return prev[k]