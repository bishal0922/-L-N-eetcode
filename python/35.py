class Solution:
    def searchInsert(self, nums, target):
        l, r = 0, len(nums) - 1

        while l <= r:
            mid = l + (r - l )//2

            if nums[mid] == target:
                return mid
            elif target > nums[mid]:
                l = mid + 1
            else:
                r = mid - 1

        return l
