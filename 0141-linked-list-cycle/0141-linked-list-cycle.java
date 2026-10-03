/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode temp = head;
        ListNode start = head;
        while(start != null && start.next != null){
            temp = temp.next;
            start = start.next.next;
            if(temp == start){
                return true;
            }
        }
        return false;
    }
}