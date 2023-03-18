#Reverse Linked List 206

class Solution:
    def reverseList(self, head):
        prev, curr = None, head

        while curr:
            dummy = curr.next
            curr.next = prev
            prev = curr
            curr = dummy

        return prev
