/*
 * Author:
 * Time Complexity:
 * Space Complexity:
 */

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);

        ListNode slow = dummy, fast = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
        
    }
}

        
        

        
        