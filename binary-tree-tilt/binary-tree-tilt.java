class Solution {
    int sum=0;
    public int findTilt(TreeNode root) {
        findTiltHelper(root);
        return sum;
    }

    private int findTiltHelper(TreeNode root) {
        if(root==null) return 0;
        int leftSum = findTiltHelper(root.left);
        int rightSum = findTiltHelper(root.right);
        sum += Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
}