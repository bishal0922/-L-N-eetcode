def ReverseLinkedList(self, head):
    #we take the head

    dummy = None
    prev = None
    curr = head

    while curr:
        dummy = curr.next
        curr.next = prev
        prev = curr
        curr = dummy

    return prev #because curr and dummy will be None and prev is the last node 


    # 1 -> 2 -> 3 -> 4 -> 5 
