import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        // it will count the frequency of numbers
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]] += 1;
        }
        // count number less the i
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }
        // Add the count of each nums[i]
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp == 0)
                nums[i] = 0;
            else {
                nums[i] = count[temp - 1];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(nums)));
    }
}
