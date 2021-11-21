# Given two lists of integers a and b sorted in ascending order, merge them into one large sorted list.

class Solution:
    def solve(self, a, b):
        i, j = 0, 0
        c = []
        while i < len(a) and j < len(b):
            if a[i] < b[j]:
                c.append(a[i])
                i += 1
            else:
                c.append(b[j])
                j += 1
        if i < len(a):
            c += a[i:]
        if j < len(b):
            c += b[j:]
        return c