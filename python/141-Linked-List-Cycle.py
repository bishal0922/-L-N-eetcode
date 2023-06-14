# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        #hmap can store the current node and the next

        #key = node.val ===== value = node.next.val
        hmap = {}

        ptr = head
        # print(f"init: This is ptr {ptr.val} next is {ptr.next.val}")

        while ptr and ptr.next:
            if ptr in hmap and hmap[ptr] == ptr.next:
                return True 
            
            hmap[ptr] = ptr.next
            
            ptr = ptr.next
            
        return False 
