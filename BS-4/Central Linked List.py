# Given a singly linked list node, return the value of the middle node. If there's two middle nodes, then return the second one.

class Solution:
    def solve(self, node):
        if node is None:
            return None
        slow = node
        fast = node
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
        return slow.val