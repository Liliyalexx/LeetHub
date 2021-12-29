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
class Solution { 
    
    private int numOfGoodNodes = 0;
    
    public int goodNodes(TreeNode root) {
       dfs(root, Integer.MIN_VALUE);
        
        return numOfGoodNodes;
    }
    
    private void dfs(TreeNode node, int maxSoFar){
              
        if (maxSoFar <= node.val) { 
            numOfGoodNodes++;
            
            }
        
         if (node.right != null) {
            dfs(node.right, Math.max(node.val, maxSoFar));
        }
        
        if (node.left != null) {
            dfs(node.left, Math.max(node.val, maxSoFar));
        }
            
            
    }
        
                           
}
        
       