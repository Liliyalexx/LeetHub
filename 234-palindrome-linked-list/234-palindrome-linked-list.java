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
    public boolean isPalindrome(ListNode head) {
       List<Integer> list = new ArrayList<>();
        
        //Convert LInked List into ArrayList
        ListNode currentNode = head;
        while (currentNode != null) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
            
        }
        
        //Reverse list ArrayList
        
        List<Integer> reversedList = new ArrayList<>();
        
        for(int i = list.size() -1; i >=0; i--){
            reversedList.add(list.get(i));
        }
        //Check if the two array list are equal to each other
        
          for(int i =0; i < list.size(); i++){
                if(list.get(i) != reversedList.get(i)) {
                return false; 
                    }
          }
    
                return true;

        
    }
}