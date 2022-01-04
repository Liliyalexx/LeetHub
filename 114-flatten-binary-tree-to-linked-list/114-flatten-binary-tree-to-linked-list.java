/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public void flatten(TreeNode root) {
//         if( root == null) return;
        
//         Stack<TreeNode> stack = new Stack();
//         stack.push(root);
        
        
//         while (!stack.isEmpty()){
//             TreeNode current_node = stack.pop();
//             if (current_node.right !=null) {
//               stack.push(current_node.right);
                
            
//             }
            
//             if(current_node.left !=null){
//                stack.push(current_node.left);
            
//             }
            
//             if(!stack.isEmpty()) {
//             current_node.right = stack.peek();
            
//             }
            
//             current_node.left = null;
//         }
        
        
//     }
// }

class Solution {
    
    private TreeNode flattenTree(TreeNode node) {
        
        // Handle the null scenario
        if (node == null) {
            return null;
        }
            
        // For a leaf node, we simply return the
        // node as is.
        if (node.left == null && node.right == null) {
            return node;
        }
        
        //Recursively flatten the left subtree
        TreeNode leftTail = this.flattenTree(node.left);
        
        // Recursively flatten the right subtree
        TreeNode rightTail = this.flattenTree(node.right);
        
        // If there was a left subtree, we shuffle the connections
        // around so that there is nothing on the left side
        // anymore.
        if (leftTail != null) {
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        
        // We need to return the "rightmost" node after we are
        // done wiring the new connections. 
        return rightTail == null ? leftTail : rightTail;
    }
    
    public void flatten(TreeNode root) {
        
        this.flattenTree(root);
    }
}