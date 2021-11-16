
// Given strings a and b, return the length of the shortest string that has both a and b as subsequences.
// A string a is a subsequence of another string b if you can delete some (or 0) letters from b, without changing the order, and get a. For example, "ace" is a subsequence of "abcde".

import java.util.*;

class Solution {
    public int solve(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[a.length()][b.length()];
    }
}