class MinStack:

    def __init__(self):
        self.l = []  
        self.s = []

    def push(self, val: int) -> None:
        if self.l:
            if val < self.s[-1]:
                self.s.append(val)
            else:
                self.s.append(self.s[-1])
        else:
            self.s.append(val)
        self.l.append(val)

        

    def pop(self) -> None:
        self.l.pop()
        self.s.pop()

    def top(self) -> int:
        return self.l[-1]

    def getMin(self) -> int:
        return self.s[-1]
        
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
