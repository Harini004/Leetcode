class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        ans = [0] * len(temperatures)
        stack = []
        for i, n in enumerate(temperatures):
            while stack and n>stack[-1][0]:
                stackT, stackIndex = stack.pop()
                ans[stackIndex] = (i-stackIndex)
            stack.append([n,i])
        return ans
        