## Note that there are two solutions
class Solution:
    def trap(self, height: List[int]) -> int:

        l , r = 0, len(height) -1
        maxl, maxr = height[l], height[r]
        res = 0

        while l < r:
            if maxl <= maxr:
                l+=1
                maxl = max(maxl, height[l])
                res+= maxl - height[l]
            else:
                r-=1
                maxr = max(maxr, height[r])
                res+= maxr - height[r]
        

        return res

## Second Solution

class Solution:
    def trap(self, height: List[int]) -> int:
        # formula is min[max height left, max hegiht right] - height[i]

        maxL = [0] * len(height)
        ml = 0
        maxR = [0] * len(height)
        mr = 0

        for i in range(len(height)):
            maxL[i] = ml 
            if height[i] > ml:
                ml = height[i]
        
        for i in range(len(height)-1 , -1 , -1):
            maxR[i] = mr 
            if height[i] > mr:
                mr = height[i]
        
        r = 0
        for i in range(len(height)):
            water = min(maxL[i], maxR[i]) - height[i]
            if water > 0:
                r+=water

        return r


