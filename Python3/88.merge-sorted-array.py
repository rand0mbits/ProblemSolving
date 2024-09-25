# Author: Val Schuman
# Date: 2024-09-25
# Description: Solution for LeetCode problem 88. Merge Sorted Array
# URL: https://leetcode.com/problems/merge-sorted-array/description/

from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # create a temp empty list
        out = []
        # indexes for nums1 and nums2
        i1 = i2 = 0

        # loop the combined length of both arrays
        for i in range(m + n):
            # append from nums1 if the nums1 index is < nums1 length and if either
            # nums2 index is >= nums2 length or the current value in nums1 is < the
            # current value in nums2
            if i1 < m and (i2 >= n or nums1[i1] < nums2[i2]):
                out.append(nums1[i1])
                # since we added from nums1, increment its index
                i1 += 1
            # if we added everything from nums1 or the current value in nums1 is
            # not less than the current value of nums2, add from nums2
            else:
                out.append(nums2[i2])
                # since we added from nums1, increment its index
                i2 += 1

        # copy all from temp array to nums1
        for i in range(m + n):
            nums1[i] = out[i]