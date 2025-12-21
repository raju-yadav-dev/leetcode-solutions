# 13. Roman to Integer

🔗 https://leetcode.com/problems/roman-to-integer/

## Problem Summary
Convert a Roman numeral string into its corresponding integer value.
Some symbols subtract when placed before larger symbols.

## Examples

Input: s = "III"  
Output: 3

Input: s = "MCMXCIV"  
Output: 1994

## Approach
- Traverse the string from left to right.
- If the current value is smaller than the next value, subtract it.
- Otherwise, add it to the result.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
