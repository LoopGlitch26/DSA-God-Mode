
// Given a binary tree root, return the number of perfect nodes. 
// A perfect node has two properties: 
// Has both children. 
// The sum of one subtree is even and the sum of the other subtree is odd

// INCORRECT SOLUTION

import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
        if(root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if(root.left != null && root.right != null) {
            if((root.left.val + root.right.val) % 2 == 0) {
                return left + right + 1;
            }
        }
        return left + right;
    }
}