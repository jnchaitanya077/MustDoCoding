// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

// You may assume that the array is non-empty and the majority element always exist in the array.

// Example 1:

// Input: [3,2,3]
// Output: 3
// Example 2:

// Input: [2,2,1,1,1,2,2]
// Output: 2

import java.util.*;

class Solution{
    public int majorityElement(int[] arr) {
        if(arr.length == 1) return arr[0];
        int mid = arr.length/2;
        Arrays.sort(arr);
        return arr[mid]; 
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        Solution a = new Solution();
        System.out.println(a.majorityElement(arr)); 
        
    }
}