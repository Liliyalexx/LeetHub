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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         while(head!=null){
//             ListNode nextTemp = cur.next;
//             curr.next = prev;
//             prev=curr;
//             curr = nextTemp;
            
//         }
//        return prev;
        
//     }
// }

class Solution{
public ListNode reverseList(ListNode head) {
   
    ListNode prev = null;
    while (head != null) {
        ListNode n = head.next;
        head.next = prev;
        // System.out.println(prev);
        prev = head;
        head = n;
    }
    return prev;
}
}