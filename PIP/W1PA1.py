# Write a function: def solution(A) that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A. 
# Find most optimised solution.
def solution(A):
    A.sort()
    for i in range(len(A)):
        if A[i] > 0 and A[i] != A[i-1]:
            return A[i]
    return A[-1]+1
    
print(solution([-1, -3]))