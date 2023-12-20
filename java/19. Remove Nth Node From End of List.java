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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //utilize the "n" value that is passed in, that is the offset
        
        //Creating our own head which is outside of the given LL
        ListNode x = new ListNode(0, head);
        
        //creating two pointers where  fast will help us find the end of the list and slow will help us delete the node
        //the difference between fast and slow will always be "n"
        //setting them both to the dummy node x
        ListNode slow = x;
        ListNode fast = x;
        
        //this for loop will help us create the n distance we want between fast and slow
        //if n is 2 then this loop with execute till (i < 3) i.e i=0,1,2 --> 3 times 
        for (int i = 0; i < n+1 ; i++){
            fast = fast.next;
        }
        
        //this while loop will help us reach the end of the list (fast == null) while maintaing the n distance between fast and slow
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        //now we have fast at the end of the list and if we backtrack n times we reach the n+1 node from the end
        //now the n+1 node has to point at the n-1 for us to remove the n node
        slow.next = slow.next.next;
        
        //we return the head as pointer from dummy because our head could be manipulated if the node we want removed is the starting head
        return x.next;
    }
}
