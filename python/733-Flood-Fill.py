class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        visited = [[0] * len(image[0]) for i in range(len(image))]
        base_color = image[sr][sc]

        self.dfs(image, sr, sc, color, base_color, visited)
        # base condition should be within limits, cannot be a base color, should be the same as goal
        print(visited)
        return image 
     


    
    def dfs(self, image, sr, sc, color, base_color, visited):
        # make sure that it is within bounds, same base color, shouldn't have been visited
        if (sc < 0 or sr < 0 or sc >= len(image[0]) or sr >= len(image) or image[sr][sc] != base_color or visited[sr][sc] == 1):
            return
        
        visited[sr][sc] = 1

        image[sr][sc] = color

        # dfs up down left right
        self.dfs( image, sr, sc+1, color, base_color, visited)
        self.dfs( image, sr, sc-1, color, base_color, visited)
        self.dfs( image, sr+1, sc, color, base_color, visited)
        self.dfs( image, sr-1, sc, color, base_color, visited)
        

