class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operators = ['+', '-', '*', '/']
        stack = []

        for t in tokens:
            if t in operators:
                a = int(stack.pop())
                b = int(stack.pop())
                if t == '+':
                    stack.append(a+b)
                elif t == '/':
                    stack.append(b/a)
                elif t == '-':
                    stack.append(b-a)
                else: 
                    stack.append(a*b)
            else:
                stack.append(t)
        
        return int(stack[0])



        
