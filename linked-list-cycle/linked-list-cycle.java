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
        Set<ListNode> node = new HashSet<>();
        ListNode current = head;
        while(current!=null){
            if(node.contains(current)){
            return true;

        }else{
        node.add(current);
         current = current.next;
    }
    
}
      return false;
}
}
