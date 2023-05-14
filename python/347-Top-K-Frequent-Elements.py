class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hmap = {}

        for n in nums:
            if n not in hmap:
                hmap[n] = 0
            hmap[n]+=1


        heap = []

        for num, freq in hmap.items():
            heapq.heappush(heap, (-freq, num))

        print(heap)

        r = []

        for i in range(k):
            r.append(heapq.heappop(heap)[1])
        
        return r


        
