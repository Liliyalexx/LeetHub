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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(size-->0){
                TreeNode rn=q.remove();
                list.add(rn.val);
                if(rn.left!=null) q.add(rn.left);
                if(rn.right!=null) q.add(rn.right);
            }
            ans.add(list);
        }
        return ans;
    }
}