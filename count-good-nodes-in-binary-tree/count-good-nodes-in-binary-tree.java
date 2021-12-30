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
    
//     private int numOfGoodNodes = 0;
    
//     public int goodNodes(TreeNode root) {
//        dfs(root, Integer.MIN_VALUE);
        
//         return numOfGoodNodes;
//     }
    
//     private void dfs(TreeNode node, int maxSoFar){
              
//         if (maxSoFar <= node.val) { 
//             numOfGoodNodes++;
            
//             }
        
//          if (node.right != null) {
//             dfs(node.right, Math.max(node.val, maxSoFar));
//         }
        
//         if (node.left != null) {
//             dfs(node.left, Math.max(node.val, maxSoFar));
//         }
            
            
//     }
        
                           
// }
        
     class Pair {
    public TreeNode node;
    public int maxSoFar;
    
    public Pair(TreeNode node, int maxSoFar) {
        this.node = node;
        this.maxSoFar = maxSoFar;
    }
}

class Solution {
    public int goodNodes(TreeNode root) {
        int numGoodNodes = 0;
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, Integer.MIN_VALUE));
        
        while (stack.size() > 0) {
            Pair curr = stack.pop();
            if (curr.maxSoFar <= curr.node.val) {
                numGoodNodes++;
            }
            
            if (curr.node.left != null) {
                stack.push(new Pair(curr.node.left, Math.max(curr.node.val, curr.maxSoFar)));
            }
            
            if (curr.node.right != null) {
                stack.push(new Pair(curr.node.right, Math.max(curr.node.val, curr.maxSoFar)));
            }
        }

        return numGoodNodes;
    }
}  