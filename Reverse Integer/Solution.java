// Given a 32-bit signed integer, reverse digits of an integer.

// Example 1:

// Input: 123
// Output: 321
// Example 2:

// Input: -123
// Output: -321
// Example 3:

// Input: 120
// Output: 21
// Note:
// Assume we are dealing with an environment which could only store integers within 
// the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when 
// the reversed integer overflows.
public class Solution {
    public int reverse(int num) {
        boolean isNegative = false;
        if(num < 0){
            isNegative = true;
            num = -1 * num;
        }
        long rev = 0;
        while(num > 0){
            int temp = num%10;
            rev = (rev * 10) + temp;
            num = num/10;
        }
        System.out.println(rev);
        if(rev > Integer.MAX_VALUE) return 0;
        return (isNegative) ? (int) (-1*rev) : (int) rev ;
    }

    public static void main(String[] args) {
        int num = 120;
        Solution s = new Solution();
        System.out.println(s.reverse(num));
        
    }
    
}
