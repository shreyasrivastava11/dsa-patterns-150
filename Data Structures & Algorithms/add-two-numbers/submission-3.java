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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        int cnt = 0;
        ListNode head = l2;

        int l1Size = listSize(l1);
        int l2Size = listSize(l2);

        if(l1Size > l2Size){
            l2 = listEqual(l2, l1Size - l2Size);
        }

        if(l2Size > l1Size){
            l1 = listEqual(l1, l2Size - l1Size);
        }

        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + cnt;
            
            if(sum < 10){
                l2.val = sum;
                cnt = 0;
            }else{
                l2.val = sum % 10;
                cnt = 1;
            }

            if (l2.next == null && cnt == 1) {
                l2.next = new ListNode(1);
                cnt = 0;
            }

            l2 = l2.next;
            l1 = l1.next;
        }

        return head;
    }

    public int listSize(ListNode l){
        int cnt = 0;
        while(l != null){
            cnt+=1;
            l = l.next;
        }

        return cnt;
    }

    public ListNode listEqual(ListNode s1, int cnt){
        ListNode head = s1;

        while(s1.next != null){
            s1 = s1.next;
        }

        while(cnt > 0){
            s1.next = new ListNode(0);
            s1 = s1.next;
            cnt--;
        }

        return head;

    }
}
