"""

Given a binary tree root, return the maximum width of any level in the tree. The width of a level is the number of nodes that can fit between the leftmost node and the rightmost node.


"""




# class Tree:
#     def __init__(self, val, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self, root):
        if not root:
            return 0
        queue = [(root, 1)]
        max_width = 0
        while queue:
            node, width = queue.pop(0)
            max_width = max(max_width, width)
            if node.left:
                queue.append((node.left, width * 2))
            if node.right:
                queue.append((node.right, width * 2))
        return max_width

# Wrong Answer