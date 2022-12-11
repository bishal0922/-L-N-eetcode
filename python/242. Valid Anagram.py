class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # This solution is O(nlogn)
        # return sorted(s) == sorted(t)

        # This solution is O(n) and involves using a bucket array to keep track of the characters

        bucket = [0] * 26

        for c in s:
            bucket[ord(c) - ord('a')]+=1
        for c in t:
            bucket[ord(c) - ord('a')]-=1

        for n in bucket:
            if n != 0: return False
        
        return True
            
        # Another similar solution implementing a map
        # map = {}
        
        # for c in s:
        #     if c not in map:
        #         map[c] = 0
        #     map[c]+=1
        # for c in t:
        #     if c not in map:
        #         map[c] = 0
        #     map[c]-=1

        # for n in map.values():
        #     if n != 0: return False
    
        # return True