// Given a non-negative integer num, return whether it is a palindrome. Bonus: Can you solve it without using strings?
// A palindrome is a number that reads the same backward as forward. For example, 1234321 is a palindrome.

import java.util.*;

class Solution {
    public boolean solve(int num) {
        //if (num < 0) return false; // negative numbers are not palindromes
        //if (num < 10) return true; // single digit numbers are palindromes
        int n = num;
        int rev = 0; 
        while (n > 0) {
            rev = rev * 10 + n % 10; 
            n /= 10;
        }
        return rev == num;
    }
}