// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You may assume no duplicates in the array.

// Example 1:

// Input: [1,3,5,6], 5
// Output: 2
// Example 2:

// Input: [1,3,5,6], 2
// Output: 1
// Example 3:

// Input: [1,3,5,6], 7
// Output: 4
// Example 4:

// Input: [1,3,5,6], 0
// Output: 0
public class Solution {

    public int insertIndex(int[] arr, int target) {
        int len = arr.length;
        int low = 0;
        int high = len-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                low =  mid + 1;
            }
            if(arr[mid] > target){
                high = mid - 1;
            }
        }
        return low;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        Solution s = new Solution();
        System.out.println(s.insertIndex(arr, target));
    }
}
