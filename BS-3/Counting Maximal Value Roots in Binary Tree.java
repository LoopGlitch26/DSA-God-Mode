# Given a binary tree root, count and return the number of nodes where its value is greater than or equal to the values of all of its descendants.
class Solution:
    def solve(self, root):
        if root is None:
            return 0
        return self.count(root)

    def count(self, root):
        if root is None:
            return 0
        return self.count(root.left) + self.count(root.right) + 1 if root.val >= max(root.left.val, root.right.val) else self.count(root.left) + self.count(root.right)