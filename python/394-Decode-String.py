class Solution:
    def decodeString(self, s: str) -> str:
        stack = []

        for c in s:
            if c != ']':
                stack.append(c)
            else:
                #meaning this is an end ']'
                r = ""
                while len(stack) > 0 and stack[-1] != '[':
                    popped = stack.pop()
                    r = popped + r
                #this character should be repeated
                if stack[-1] == "[":
                    stack.pop()
                print(r)

                n = ""
                while len(stack) > 0 and stack[-1].isnumeric():
                    popped = stack.pop()
                    n = popped + n
                num = int(n)
                stack.append(num*r)

        return ''.join(stack)
                
