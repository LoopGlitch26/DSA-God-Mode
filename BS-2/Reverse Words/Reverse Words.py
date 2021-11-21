# Given a string s of words delimited by spaces, reverse the order of words.

class Solution:
    def solve(self, sentence):
        return ' '.join(sentence.split()[::-1])