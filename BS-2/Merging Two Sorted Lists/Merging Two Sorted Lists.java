
// Given two lists of integers a and b sorted in ascending order, merge them into one large sorted list.

import java.util.*;

class Solution {
    public int[] solve(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }
}

/* 

In Python

Intuition
Since both of the input collections are sorted, we can just work from front-to-back over both collections and take the minimum remaining from each of the collections. Once one of the collections has been entirely consumed, we can just stick the remaining items onto the end of the result because they must be greater (and already sorted).

Implementation
We maintain a pointer into each collection and append the minimum at each step of the way. Once a collection has been entirely consumed, we can just stick the rest of the remaining items on the result because they must all be greater (and already sorted).

Time Complexity
O(n) Each item in the input lists will produce exactly one comparison, append, and increment.

Space Complexity
O(n) The only storage required is a pair of ints and a list that will contain the same elements as the two input collections.

class Solution:
    def solve(self, l, r):
        li, ri, result = 0, 0, []
        while li < len(l) and ri < len(r):
            if l[li] <= r[ri]:
                result.append(l[li])
                li += 1
            else:
                result.append(r[ri])
                ri += 1

        return result + l[li:] + r[ri:]

*/