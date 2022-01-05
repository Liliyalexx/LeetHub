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
    public ListNode middleNode(ListNode head) {
       ListNode[] list = new ListNode[100];
        int t = 0;
         while (head != null) {
        list[t++] = head;
        head = head.next;
                      
        }
        return list[t / 2];
        
    }
}
