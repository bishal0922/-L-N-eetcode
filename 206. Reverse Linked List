/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //To reverse the linked list, we need to update the pointers to point in the opposite direction
        //For this we need a tracker to keep track of end of list
        //A variable node to replace every node as we go through
        //A variable that is behind last 2 and is the one being pointed at 
        
        ListNode replacer = null;
        ListNode current = head;
        ListNode leader = null;
        //so [replacer] <- [current] -> [leader]
                                                
        //while we don't reach the end of list, we move three while replacing the current's pointer
        while (current != null){
            leader = current.next;
            current.next = replacer;
            replacer = current;
            current = leader;
        }
                                                
        //after reversing the pointer, replacer always moves onto the last node to get replaced
        //if we reach the end of list, replacer will always be at the last node hence our head
                                                
        //we can also change head as head = replacer;
        return replacer;
    }
}
