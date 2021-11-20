# Given a non-negative integer n, return the length of the longest consecutive run of 1s in its binary representation.

class Solution:
    def solve(self, n):
        max_len = 0
        cur_len = 0
        while n:
            if n & 1:
                cur_len += 1
            else:
                max_len = max(max_len, cur_len)
                cur_len = 0
            n >>= 1
        return max(max_len, cur_len)