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
public class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) { 
        List < Integer > left_boundary = new LinkedList < > (), right_boundary = new LinkedList < > (), leaves = new LinkedList < > ();
        
        preorder(root, left_boundary, right_boundary, leaves, 0);
        left_boundary.addAll(leaves);
        left_boundary.addAll(right_boundary);
        return left_boundary;
        
    }
    
    public boolean isLeaf(TreeNode cur) {
return (cur.left == null && cur.right == null );
    
    }
    
    public boolean isRightBoundary (int flag){
        return (flag == 2);
    }
    
    public boolean isLeftBoundary ( int flag){
        return (flag == 1);
    }
    
    public boolean isRoot(int flag) {
        return (flag ==0);
    }
    
    public int leftChildFlag(TreeNode cur, int flag) {
        if(isLeftBoundary(flag) || isRoot(flag)) 
            return 1;
        else if (isRightBoundary(flag) && cur.right == null)
            return 2;
            else return 3;
            
        }
            
           public int rightChildFlag(TreeNode cur, int flag) {
        if (isRightBoundary(flag) || isRoot(flag))
            return 2;
        else if (isLeftBoundary(flag) && cur.left == null)
            return 1;
        else return 3;
                
           
    }
    
     public void preorder(TreeNode cur, List < Integer > left_boundary, List < Integer > right_boundary, List < Integer > leaves, int flag) {
        if (cur == null)
            return;
        if (isRightBoundary(flag))
            right_boundary.add(0, cur.val);
        else if (isLeftBoundary(flag) || isRoot(flag))
            left_boundary.add(cur.val);
        else if (isLeaf(cur))
            leaves.add(cur.val);
        preorder(cur.left, left_boundary, right_boundary, leaves, leftChildFlag(cur, flag));
        preorder(cur.right, left_boundary, right_boundary, leaves, rightChildFlag(cur, flag));
    }
}