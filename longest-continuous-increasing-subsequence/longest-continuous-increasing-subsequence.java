class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result=0;
        int anchor = 0;
        
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i-1]>= nums[i]) anchor = i;
            result = Math.max(result, i-anchor+1);
        }
        return result;
        
    }
}