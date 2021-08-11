/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        
        Node temp = head;
        Map<Node, Node> hm = new HashMap<>();
        while(temp!=null){
          Node myNode = new Node(temp.val);
            hm.put(temp, myNode);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
         Node myNode = hm.get(temp);
            myNode.next =hm.get(temp.next);
            myNode.random = hm.get(temp.random);
            temp = temp.next;
        }
        return hm.get(head);
    }
}