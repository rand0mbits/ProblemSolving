# Author: Val Schuman
# Date: 2024-09-25
# Description: Solution for LeetCode problem 27. Remove Element
# URL: https://leetcode.com/problems/remove-element/

from typing import List

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        # keep track of two indexes: the index of the element we're checking
        # to see if it's equal to val, and the index we're going to try to
        # swap it with
        i = 0
        right = len(nums) - 1
        # loop until the index we're checking and the index we're swapping with have
        # become the same or passed one another.
        while i <= right:
            # if the element we're checking is to be removed, replace it with
            # an element that should not be removed from the right side of the array
            if nums[i] == val:
                right = self.replace(nums, val, i, right)
            i += 1

        # since "right" is the index of the last removed element minus 1
        # right plus 1 is the length of the part of the array with all of
        # the "remaining" elements.
        return right + 1

    def replace(self, nums: List[int], val: int, from_i: int, to_i: int) -> int:
        # decrement to_i until the value at to_i is not equal to "val"
        # or until to_i is equal to the index we want to move from, from_i
        while nums[to_i] == val and from_i < to_i:
            to_i -= 1

        # replace the element being removed with the element at to_i
        nums[from_i] = nums[to_i]

        # return the updated end index, one position before the last swapped element.
        # note: at this point it's possible that to_i is equal to from_i,
        #       and the value at the index is equal to "val". this is ok, as the value
        #       at to_i - 1 will still be the right-most value not equal to "val".
        return to_i - 1
