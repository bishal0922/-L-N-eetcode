class Solution:
    def isValid(self, s: str) -> bool:
        #this hashmap contains the closing to opening 
        hmap = {
            ")": "(",
            "]": "[",
            "}": "{"
        }
        
        #this list will behave like a stack append() + pop()
        stack = []
        for c in s:
            #if the char is a closing paren.
            if c in hmap:
                if len(stack) != 0 and stack[-1] == hmap[c]:
                    stack.pop()
                else:
                    return False
            else:
                #means this is a starting paren.
                stack.append(c)

        # {()} - test case
        return True if len(stack) == 0 else False 
