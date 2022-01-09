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
//     public boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList<>();
        
//         //Convert LInked List into ArrayList
//         ListNode currentNode = head;
//         while (currentNode != null) {
//             list.add(currentNode.val);
//             currentNode = currentNode.next;
            
//         }
        
//         //Reverse list ArrayList
        
//         List<Integer> reversedList = new ArrayList<>();
        
//         for(int i = list.size() -1; i >=0; i--){
//             reversedList.add(list.get(i));
//         }
//         //Check if the two array list are equal to each other
        
//           for(int i =0; i < list.size(); i++){
//                 if(list.get(i) != reversedList.get(i)) {
//                 return false; 
//                     }
//           }
    
//                 return true;

        
//     }
// }

//Time O(3N) = O(N)
//Space O(2N) = O(N)

class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null) return true;

        // Find the end of first half and reverse second half.
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        // Check whether or not there is a palindrome.
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) result = false;
            p1 = p1.next;
            p2 = p2.next;
        }        

        // Restore the list and return the result.
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    // Taken from https://leetcode.com/problems/reverse-linked-list/solution/
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}