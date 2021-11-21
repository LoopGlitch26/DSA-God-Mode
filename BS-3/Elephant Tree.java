// Given a binary tree root, return the same tree except every node's value is replaced by its original value plus all of the sums of its left and right subtrees.

import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public Tree solve(Tree root) {
        if (root == null) {
            return null;
        }
        root.val += dfs(root.left) + dfs(root.right);
        root.left = solve(root.left);
        root.right = solve(root.right);
        return root;
    }
    private int dfs(Tree root) {
        if (root == null) {
            return 0;
        }
        return root.val + dfs(root.left) + dfs(root.right);
    }
}