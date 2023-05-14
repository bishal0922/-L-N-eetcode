class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre, post = 1, 1
        r = [1] * len(nums)

        for i in range(len(nums)):
            r[i] = pre
            pre *= nums[i]

        for i in range(len(nums)-1, -1, -1):
            r[i] *= post 
            post *= nums[i]
        
        return r

        
