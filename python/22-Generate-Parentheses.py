class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        #only add open brackets if open < n
        #only add close brackets if closed < open
        #valid if open == closed == n (base case)

        stack = []
        res = []

        def backtrack(openN, closedN):
            if openN == closedN == n:
                x = "".join(stack)
                res.append(x)
                return 
            
            if openN < n:
                #add a open 
                stack.append(
                    "("
                )
                backtrack(openN +1 , closedN)
                #pop the character we just added
                stack.pop()
            if closedN < openN:
                #add a open 
                stack.append(
                    ")"
                )
                backtrack(openN , closedN + 1)
                stack.pop()
        
        backtrack(0, 0)
        return res

        
