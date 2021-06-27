/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.

*/

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        while(i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if(result > max / 10 || (result == max / 10 && digit > 7)) {
                return sign == 1 ? max : min;
            }
            if(result < min / 10 || (result == min / 10 && digit < -8)) {
                return sign == 1 ? max : min;
            }
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }
}