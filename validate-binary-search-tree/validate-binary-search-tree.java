
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         Stack<TreeNode> stack = new Stack();
//         double left_child_val = -Double.MAX_VALUE;
        
//         while (!stack.isEmpty() || root !=null){
//            while(root !=null){
//             stack.push(root);
//                root = root.left;
//            } 
            
            
//             root = stack.pop();
//             if(root.val <= left_child_val) return false;
//             left_child_val = root.val;
//             root = root.right;
            
//         }
        
//         return true;
//     }
// }

class Solution{
public boolean isValidBST(TreeNode root){
return validate(root, null, null);
}
    
 public boolean validate(TreeNode root, Integer max, Integer min){
    if(root ==null){
        return true;
    } else if(max !=null && root.val>=max || min!= null && root.val <= min){
       return false;
    } else {
        return validate(root.left, root.val, min) && validate(root.right, max, root.val);
    }
 }   
    
}
// Space Complexity: O(n);
// Run Time: O(n);