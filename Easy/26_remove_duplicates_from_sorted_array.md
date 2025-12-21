# 26. Remove Duplicates from Sorted Array

🔗 https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Problem Summary
Given a sorted array, remove duplicate elements in-place so that each unique
element appears only once. Return the count of unique elements.

## Examples

Input: nums = [1,1,2]  
Output: k = 2, nums = [1,2,_]

Input: nums = [0,0,1,1,2,2,3]  
Output: k = 4, nums = [0,1,2,3,_]

## Approach
- Use two pointers.
- One pointer tracks the position of unique elements.
- Copy unique values forward.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
