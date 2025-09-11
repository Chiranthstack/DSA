/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null; // safety check

        //first get the length of both ll
        int lenA = 0, lenB = 0;
        ListNode tempA = headA, tempB = headB;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        //move head pointer based on which is long
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }

        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }

        // Now both heads are at same distance from intersection
        // Start moving them both until they meet
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        //we  reached faak!!
        return headA;
    }
}
