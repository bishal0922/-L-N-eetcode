# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1, list2):
        #heads
        l1 = list1
        l2 = list2

        ret = ListNode(-1, None)
        main = ret 

        #till we reach either l1 or l2
        while l1 and l2:
            if l1.val <= l2.val:
                main.next = l1
                l1 = l1.next
                main = main.next
            else:
                #add l2
                main.next = l2
                l2 = l2.next
                main = main.next
        

        #if l1 isn't the end 
        if l1:
            main.next = l1
        if l2:
            main.next = l2

        return ret.next
        
