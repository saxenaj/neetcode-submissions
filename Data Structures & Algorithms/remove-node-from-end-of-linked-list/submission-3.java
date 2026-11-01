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

         ListNode current=head;
        ListNode forward = head;
        int i=0;
        while(forward != null && i<n) {
         forward = forward.next;
         i++;
        }
    
        if(forward == null) {
            return head.next;
        }

        while(forward.next != null){
            current = current.next;
            forward = forward.next;

        }
        ListNode lis=current.next;
        current.next = current.next.next;
        
        return head;

    }
}
