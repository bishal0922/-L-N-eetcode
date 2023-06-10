class Solution:

    def integerReplacement(self, n: int) -> int:
        hmap = {}
        return self.helper(n, hmap) 

    def helper(self, n: int, hmap) -> int:
        if n == 1:
            return 0
        if n in hmap:
            return hmap[n]
        else:
            if n % 2 == 0:
            #this is even
                hmap[n] = self.helper(n/2, hmap) + 1
            else:
                # hmap[n] = self.helper(n+1, hmap, count) + 1
                # hmap[n] = self.helper(n+1, hmap, count) + 1
                hmap[n] = min(self.helper(n+1, hmap) , self.helper(n-1, hmap) )+1

        
        return hmap[n]
