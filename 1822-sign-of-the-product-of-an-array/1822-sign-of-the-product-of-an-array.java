class Solution {
   public int arraySign(int[] nums) {
        
        int counter = 0;
    
        for (int i = 0; i < nums.length; i++){
            counter = nums[i] < 0 ? ++counter : counter;
            if(nums[i] == 0) return 0;
        }
        
        return counter % 2 == 0 ? 1 : -1;
        
    }
}