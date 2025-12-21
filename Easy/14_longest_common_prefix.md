# 14. Longest Common Prefix

🔗 **LeetCode Problem:** https://leetcode.com/problems/longest-common-prefix/

## Problem Summary
Given an array of strings, determine the longest prefix that is shared by all
strings. If no common prefix exists, return an empty string.

## Examples

**Example 1**  
Input: strs = ["flower", "flow", "flight"]  
Output: "fl"

**Example 2**  
Input: strs = ["dog", "racecar", "car"]  
Output: ""

## Approach
- Take the first string as a reference.
- Compare characters at the same index across all strings.
- Stop when a mismatch occurs or when the shortest string ends.

## Complexity
- **Time:** O(n × m)  
  where `n` = number of strings, `m` = length of the shortest string  
- **Space:** O(1)
