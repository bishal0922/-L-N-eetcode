class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        bucket = [0] * 26

        for c in s:
            bucket[ord(c) - ord('a')]+=1
        
        for c in t:
            bucket[ord(c) - ord('a')]-=1
        
        for n in bucket:
            if n != 0:
                return False

        return True
