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
        if(head == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int cnt = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            cnt+=1;
        }

        int pointer = cnt - n;
        ListNode curr = dummy;
        // we are using dummy node for handling the case when n=cnt
        int p = 0;

        while(p != pointer){
            curr = curr.next;
            p+=1;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}
