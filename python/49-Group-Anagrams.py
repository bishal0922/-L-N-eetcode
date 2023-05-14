class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = {}

        for s in strs:
            ss = ('').join(sorted(s))

            if ss not in hmap:
                hmap[ss] = []
            hmap[ss].append(s)
        
        return hmap.values()
        
