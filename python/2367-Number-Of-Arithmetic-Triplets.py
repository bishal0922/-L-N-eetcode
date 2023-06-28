class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        hset = set()
        ct= 0

        for n in nums:
            if n-diff in hset and n-(diff *2) in hset:
                ct+=1
                print()
            hset.add(n)
        
        return ct
        
