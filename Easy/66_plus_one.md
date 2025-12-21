# 66. Plus One

🔗 https://leetcode.com/problems/plus-one/

## Problem Summary
An integer is represented as an array of digits, ordered from most significant
to least significant. Increment this number by one and return the updated array.

## Examples

Input: digits = [1,2,3]  
Output: [1,2,4]

Input: digits = [9]  
Output: [1,0]

## Approach
- Start from the last digit.
- If the digit is less than 9, increment and return.
- If the digit is 9, set it to 0 and continue.
- If all digits were 9, create a new array with leading 1.

## Complexity
- **Time:** O(n)
- **Space:** O(n) (only when all digits are 9)
