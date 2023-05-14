class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()

        print(f"sorted nums: {nums}")
        hset = set()

        #iterate
            #find 0 complement

        for i in range(len(nums)):
            target = 0 - nums[i]
            l , r = i+1, len(nums) - 1

            while l < r:
                sum = nums[l] + nums[r]
            
                if sum == target:
                    hset.add(tuple([nums[i], nums[l], nums[r]]))
                    l+=1
                    r-=1
                elif sum > target:
                    r-=1
                else:
                    l+=1
        
        return list(hset)



        
