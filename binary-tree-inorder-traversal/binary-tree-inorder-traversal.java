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
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<Integer>();
//         if (root==null) return list;
//         inorder(root, list);
//         return list;
//     }
//     public void inorder(TreeNode root, List<Integer> list){
//     if(root!=null) {
//     if(root.left!=null){
//         inorder(root.left, list);
//     }
//         list.add(root.val);
//         if(root.right!=null){
//           inorder(root.right, list);
            
//             }
//     }
//     }
// }

public class Solution {
 public List<Integer> inorderTraversal(TreeNode root){
   List<Integer> out = new ArrayList<>();
    Stack <TreeNode> s = new Stack<>();
     TreeNode curr = root;
     while(curr!=null || !s.isEmpty()){
     while(curr!=null){
        s.push(curr);
         curr=curr.left;
     }
         curr = s.pop();
         out.add(curr.val);
         curr = curr.right;
         
         }
     return out;
     
 }
     
     
}
