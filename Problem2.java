
/* 

Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : NA

*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if( head == null ){
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while (count <= n){
            fast = fast.next;
            count++;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }
}