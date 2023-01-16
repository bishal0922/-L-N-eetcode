class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = set()
        for i in nums:
            if i in s:
                return True
            s.add(i)
        return False

        # O(n) Time 
        # O(n) Space
        # n is the size of the input List nums