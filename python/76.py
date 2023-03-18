class Solution:
    def minWindow(self, s: str, t: str) -> str:
        base_map = {}
        check_map = {}

        #populate the base_map
        for c in t:
            base_map[c] = 1 + base_map.get(c, 0)

        have, need = 0, len(base_map)
        res = [-1, -1]
        l = 0
        reslen = max(len(s), len(t))
    
        for r in range(len(s)):
            #iterate through the s string
            char = s[r]
            check_map[char] = 1 + check_map.get(char, 0)
        
            if char in base_map and check_map[char] == base_map[char]:
                have +=1

            #implying that this is a valid string
            while have == need:
                #compare it with the res min
                if r - l + 1 <= reslen:
                    reslen = r - l + 1
                    res = [l , r]
                
                check_map[s[l]] -=1

                if s[l] in base_map and check_map[s[l]] < base_map[s[l]]:
                    have -=1

                l+=1

        l ,r = res
        print(res)

        return s[l : r + 1]
                
