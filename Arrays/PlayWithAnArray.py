# Given an unsorted array arr of size N, rearrange the elements of array such that number at the odd index is greater than the number at the previous even index. The task is to complete the function formatArray() which will return formatted array.

# Input:
# The first line of input contains T, denoting the number of testcases. First line of every test case consists of N, denoting number of elements in an array. Second line of every testcase consists of elements in an array separated by space.

# Output:
# If the array formed is according to rules print 1, else 0.

# User task:
# Since this is a functional problem you don't have to worry about the input, you just have to complete the function formatArray(), which accepts array arr and its size 

# Constraints:
# 1 <= T <= 100
# 1 <= N <= 100
# 1 <= arr[i] <= 100

# Example:
# Input:
# 2
# 5
# 5 4 3 2 1
# 4
# 4 3 2 1
# Output:
# 1
# 1

# Explanation:
# Testcase 1: The given array after modification will be as such: 4 5 2 3 1.

# ** For More Input/Output Examples Use 'Expected Output' option **
# Contributor: Saksham Raj Seth
# Author: saksham seth

testCase = eval(input())
for eachTestCase in range(testCase):

    totalElements = eval(input())
    temp = input()

    totalElements = temp.split(" ")
    totalElementsInt = []

    for i in totalElements:
        totalElementsInt.append(int(i))

    print(totalElementsInt)

    for i in range(1,len(totalElementsInt)):
        if i%2 != 0:
            if totalElementsInt[i-1] > totalElementsInt[i]:
                temp = totalElementsInt[i-1]
                totalElementsInt[i-1] = totalElementsInt[i]
                totalElementsInt[i] = temp
    print(totalElementsInt)


