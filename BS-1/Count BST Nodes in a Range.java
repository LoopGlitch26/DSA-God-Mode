
// Given a binary search tree root, and integers lo and hi, return the count of all nodes in root whose values are between [lo, hi] (inclusive).


import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int lo, int hi) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val >= lo && root.val <= hi) {
            count++;
        }
        count += solve(root.left, lo, hi);
        count += solve(root.right, lo, hi);
        return count;
    }
}

/* 

Intuition
We can use depth first search to recursively determine the number of nodes with values that fall within the range of lo and high while taking advantage of the properties of the binary search tree:

A node's left subtree only contains nodes with values that are less than the node's value.
A node's right subtree only contains nodes with values that are greater than the node's value.
Every left and right subtree is also a binary search tree.
Implementation
Please take a look at the comments in the code for reference.

Time Complexity
The worst case will take 
O(n) time where every node's value is possible to fall in the range.

Space Complexity
There is only constant space being used, which is 
O(1).
or O(h) where h is the height of the tree.

import java.util.*;

class Solution {
    public int solve(Tree root, int lo, int hi) {
        // If there no node exists, then there is no node that
        // has a value within the range
        if (root == null) {
            return 0;
        }

        // If the value of the current node is in within the range,
        // it is addded to the count. Check both left and right subtrees since
        // they both could contain nodes with values that are within the
        // range.
        if (root.val >= lo && root.val <= hi) {
            return 1 + solve(root.left, lo, hi) + solve(root.right, lo, hi);

            // If the value of the current node is less than the range, it
            // does not count. Check the right subtree since it only contains
            // nodes with values that are greater than it.
        } else if (root.val < lo) {
            return solve(root.right, lo, hi);

            // If the value of the current node is greater than the range, it
            // does not count. Check the left subtree since it only contains
            // nodes with values that are smaller than it.
        } else {
            return solve(root.left, lo, hi);
        }
    }
}

*/