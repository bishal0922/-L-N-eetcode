class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        res = nums[0]
        while (l <= r):
            mid = (l + r) //2 
            #if we have a sorted section

            if nums[l] <= nums[r]:
                res = min(res, nums[l])
                break

            res = min(res, nums[mid])
            #if its the left portion 
            if nums[l] <= nums[mid]:
                l = mid + 1
            else:
                r = mid - 4

        return res
                

            #if its the right portion 


