class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        #for it to be a sequence there must be a start of a sequence
        hset = set()
        r = 0

        for n in nums:
            hset.add(n)

        #iterating through 
        for x in nums:
            if x - 1 not in hset:
                #number is a start of a sequence
                n = x
                while n+1 in hset:
                    n+=1

                r = max(r, (n - x + 1))
        
        return r
        
