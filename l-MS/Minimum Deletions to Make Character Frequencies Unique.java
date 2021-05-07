/*

A string s is called good if there are no two different characters in s that have the same frequency.

Given a string s, return the minimum number of characters you need to delete to make s good.

*/

class Solution {
    public int minDeletions(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()) {
            count[c-'a']++;
        }
        int max = 0;
        for(int i=0; i<26; i++) {
            max = Math.max(max, count[i]);
        }
        int res = 0;
        for(int i=0; i<26; i++) {
            if(count[i] > max) {
                res += count[i] - max;
            }
        }
        return res;
    }
}