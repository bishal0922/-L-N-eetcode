from collections import defaultdict

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rmap = defaultdict(set)
        cmap = defaultdict(set)
        bmap = defaultdict(set)

        for i in range(9):
            for j in range(9):
                n = board[i][j]
                if n == ".":
                    continue
                
                if (board[i][j] in rmap[i] or
                    board[i][j] in cmap[j] or
                    board[i][j] in bmap[(i//3, j//3)]
                    ):
                    return False

                rmap[i].add(board[i][j])
                cmap[j].add(board[i][j])
                bmap[(i//3, j//3)].add(board[i][j])

        return True
