# 88. Merge Sorted Array

🔗 LeetCode: https://leetcode.com/problems/merge-sorted-array/

## Problem Summary
You are given two sorted integer arrays `nums1` and `nums2`.
The array `nums1` has extra space at the end to hold all elements of `nums2`.

Using the given counts `m` and `n`, merge the elements of both arrays
so that `nums1` becomes a single sorted array in non-decreasing order.
The result must be stored directly inside `nums1`.

## Examples

**Example 1**  
Input:  
nums1 = [1,2,3,0,0,0], m = 3  
nums2 = [2,5,6], n = 3  

Output:  
[1,2,2,3,5,6]

**Example 2**  
Input:  
nums1 = [1], m = 1  
nums2 = [], n = 0  

Output:  
[1]

**Example 3**  
Input:  
nums1 = [0], m = 0  
nums2 = [1], n = 1  

Output:  
[1]
