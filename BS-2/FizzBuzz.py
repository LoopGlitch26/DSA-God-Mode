# Given an integer n, return a list of integers from 1 to n as strings except for multiples of 3 use “Fizz” instead of the integer and for the multiples of 5 use “Buzz”. For integers which are multiples of both 3 and 5 use “FizzBuzz”.

class Solution:
    def solve(self, n):
        if n < 1:
            return []
        else:
            return [self.fizzBuzz(i) for i in range(1, n + 1)]

    def fizzBuzz(self, n):
        if n % 3 == 0 and n % 5 == 0:
            return 'FizzBuzz'
        elif n % 3 == 0:
            return 'Fizz'
        elif n % 5 == 0:
            return 'Buzz'
        else:
            return str(n)

# time complexity: O(n)
# space complexity: O(n)