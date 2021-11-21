// Given a binary tree root, count and return the number of nodes where its value is greater than or equal to the values of all of its descendants.

// Incorrect answer

import java.util.*;

class Solution {
    public int countNodes(Tree root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }
    private int getHeight(Tree root) {
        if (root == null) {
            return 0;
        }
        return 1 + getHeight(root.left);
    }
}