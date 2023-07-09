# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists:
            return None


        while len(lists) > 1:
            merged_lists = []
            for i in range(0, len(lists), 2):
                #get the i
                l1 = lists[i] if i < len(lists) else None
                #get the i +1
                l2 = lists[i+1] if i+1 < len(lists) else None

                #merge i and i+1
                merged_lists.append(self.mergeLists(l1, l2))
            lists = merged_lists
        
        return lists[0]
    
    def mergeLists(self, list1, list2):
        dummy = ListNode(-1)
        ptr = dummy

        l1 = list1
        l2 = list2

        while l1 and l2:
            if l1.val <= l2.val:
                ptr.next = l1
                l1 = l1.next
            else:
                ptr.next = l2
                l2 = l2.next
            ptr = ptr.next
        
        if l1:
            ptr.next = l1
        if l2:
            ptr.next = l2

        return dummy.next

            
