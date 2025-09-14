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
    public ListNode removeElements(ListNode head, int val) {
        //approcah-create a dummy head just traverse if the node has value given go to the next value or else just include the value
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        while (curr.next != null) {
        if (curr.next.val == val) {
                curr.next = curr.next.next; 
            } else {
             curr = curr.next; 
            }
        }

        return dummy.next;
    }
}
