#  Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

#  Input:
#  The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements,
#   N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

#  Output:
#  For each testcase, in a new line, output the rotated array.

#  Constraints:
#  1 <= T <= 200
#  1 <= N <= 107
#  1 <= D <= N
#  0 <= arr[i] <= 105

#  Example:
#  Input:
#  2
#  5 2
#  1 2 3 4 5 
#  10 3
#  2 4 6 8 10 12 14 16 18 20

#  Output:
#  3 4 5 1 2
#  8 10 12 14 16 18 20 2 4 6

#  Explanation :
#  Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.

#  ** For More Input/Output Examples Use 'Expected Output' option **
#  Author: atharv

testCases = eval(input())

for eachTestCase in range(testCases):
    temp = input().split(" ")

    arrSize = temp[0]
    rotations = temp[1]
    str = ""

    ele = input().split(" ")
    for nRotations in range(int(rotations)):
        first = ele.pop(0)
        ele.append(first)

    for i in range(len(ele)):
        str = str+ele[i]+" "
        str.rstrip()
        str.lstrip()

    print(str)



