
// Given a binary tree root, invert it so that its left subtree and right subtree are swapped and the children are recursively inverted.

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
        if(root == null) return null;
        Tree left = solve(root.left);
        Tree right = solve(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}    

/*

Intuition
we need to start swaping from the bottom and here mirror tree is used

Implementation
Call Mirror for left-subtree i.e., Mirror(left-subtree)
Call Mirror for right-subtree i.e., Mirror(right-subtree)
Swap left and right subtrees.

Time Complexity
here we have moved to every node 
O(n)

Space Complexity
the space complexity through calling stacks via recursion is 
O(n)

*/ 