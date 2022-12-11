from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # O(n) space because the strings have to be stored in the dictionary
        # O(n*nlogm) because as we iterate through the strings we sort each string

        map = defaultdict(lambda: [])

        for string in strs:
            s = ''.join(sorted(string))
            map[s].append(string)
        return map.values()