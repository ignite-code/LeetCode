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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy.next;
        ListNode slow = dummy;

        while(fast!=null){
            if(fast.next!=null && fast.val == fast.next.val){
                int duplicate = fast.val;

                while(fast!=null && fast.val == duplicate){
                    fast = fast.next;
                }
                slow.next = fast;
            }
            else{
                slow = fast;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}