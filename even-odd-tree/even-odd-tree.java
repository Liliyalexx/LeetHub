class Solution {
    public boolean isEvenOddTree(TreeNode root) {
     Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int level = 0;

    while(!q.isEmpty()){
        int prevOdd = Integer.MAX_VALUE, prevEven = Integer.MIN_VALUE;//starting values accoding to level
        for(int i = q.size(); i > 0; i--){
            TreeNode curr = q.poll();
            if(curr.val % 2 == level % 2)  return false;//if level and current value are same either even or odd

            if(level % 2 == 1){//if level is odd
                if(prevOdd <= curr.val) return false;//should be strictly increasing
                prevOdd = curr.val;//udpate previous value
            } else {
                if(prevEven >= curr.val) return false;//should be strictly decreasing
                prevEven = curr.val;//update previous value
            }
            // System.out.println("level:" + level + "**" + "current value:" + curr.val);

            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        level++;
    }
    return true;
  }
};