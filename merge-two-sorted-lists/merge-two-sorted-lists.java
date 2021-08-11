// class Solution {
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         // if both lists are empty then merged list is also empty
//     // if one of the lists is empty then other is the merged list
        
//         if(l1==null){
//             return l2;
//         } else if(l2==null){
//             return l1;
//         }
        
//         ListNode mergedHead = null;
//         if(l1.data<=l2.data){
    
//             mergeHead = l1;
//             l1=l1.next;
//         } else{ 
//             mergeHead = l2;
//             l2=l2.next;
// }
//         ListNode mergedTail = mergedHead;
        
//         while(l1 !=null && l2 != null){
//         ListNode temp = null;
//             if (l1.data <= l2.data){
//             temp = l1;
//             l1 = l1.next;
//             }else {
//             temp = l2;
//             l2 = l2.next;
//             } 
            
//             mergedTail.next = temp;
//             mergedTail=temp;
//         }
        
//         if (l1 != null){
//         mergedTail.next = l1;
        
//         } else if (l2!=null){
//             mergedTail.next = l2;
//         }
        
//         return mergedHead;
       
       
        
//     }
// }

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return result.next;
    }
}
    
