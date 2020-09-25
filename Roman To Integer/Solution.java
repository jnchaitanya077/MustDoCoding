// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

// Example 1:

// Input: "III"
// Output: 3
// Example 2:

// Input: "IV"
// Output: 4
// Example 3:

// Input: "IX"
// Output: 9
// Example 4:

// Input: "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 5:

// Input: "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

public class Solution {
    public int romanToInteger(String s) {
        int len = s.length();
        int value = 0;
        int i = 0; int j = 1;

        while(i < len || j < len){
            if(j < len && s.charAt(i) == 'I' && s.charAt(j) == 'V'){
                value += 4;
                i += 2;
                j = i + 1;
            }
            else if(j < len && s.charAt(i) == 'I' && s.charAt(j) == 'X' ){
                value = value + 9;
                i += 2;
                j = i + 1 ;
            }
            else if(j < len && s.charAt(i) == 'X' && s.charAt(j) == 'L' ){
                value = value + 40;
                i += 2;
                j = i + 1 ;
            }
            else if(j < len && s.charAt(i) == 'X' && s.charAt(j) == 'C'  ){
                value = value + 90;
                i += 2;
                j = i + 1 ;
            }
            else if(j < len && s.charAt(i) == 'C' && s.charAt(j) == 'D'){
                value = value + 400;
                i += 2;
                j = i + 1 ;
            }
            else if(j < len && s.charAt(i) == 'C' && s.charAt(j) == 'M' ){
                value = value + 900;
                i += 2;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'I'){
                value = value + 1;
                i++;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'V'){
                value = value + 5;
                i++;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'X'){
                value = value + 10;
                i++;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'L'){
                value = value + 50;
                i++;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'C'){
                value = value + 100;
                i++;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'D'){
                value = value + 500;
                i++;
                j = i + 1 ;
            }
            else if(s.charAt(i) == 'M'){
                value = value + 1000;
                i++;
                j = i + 1 ;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        Solution s = new Solution();
        System.out.println(s.romanToInteger(str));
    }
    
}
