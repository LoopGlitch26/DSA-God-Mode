# Given a singly linked list node, return its reverse.

class Solution:
    def solve(self, node):
        if node is None:
            return None
        prev = None
        curr = node
        while curr is not None:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        return prev
