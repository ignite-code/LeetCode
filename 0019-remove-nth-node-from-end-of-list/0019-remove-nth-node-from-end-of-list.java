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
        if(head==null) return null;
        
        ListNode dummy = head;
        int size = 0;
        while(dummy != null){
            size++;
            dummy = dummy.next;
        }
        if (n == size) return head.next;
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt == size-n){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}